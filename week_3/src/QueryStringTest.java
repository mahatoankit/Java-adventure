import static org.junit.Assert.*;



import org.junit.Test;



public class QueryStringTest {

    QueryString queryString = new QueryString("name=Alice&age=19&country=UK");

    

    @Test

    public void firstParameterOffset() {

        int offset = queryString.getParameterOffset("name");

        assertEquals(0, offset);

    }

    

    @Test

    public void middleParameterOffset() {

        int offset = queryString.getParameterOffset("age");

        assertEquals(11, offset); // "age" starts after "name=Alice&" (length 11)

    }

    

    @Test

    public void missingParameterOffset() {

        int offset = queryString.getParameterOffset("occupation");

        assertEquals(-1, offset); // Parameter "occupation" does not exist

    }

    

    @Test

    public void parameterExists() {

        assertTrue(queryString.hasParameter("age")); // "age" exists in the query string

    }

    

    @Test

    public void missingParameterDoesNotExist() {

        assertFalse(queryString.hasParameter("occupation")); // "occupation" does not exist

    }

    

    @Test

    public void incompleteParameterName() {

        assertFalse(queryString.hasParameter("nam")); // Partial name does not match "name"

    }

    

    @Test

    public void parameterValueIsNotParameterName() {
  
        assertFalse(queryString.hasParameter("Alice")); // "Alice" is a value, not a parameter name

    }

    

    @Test

    public void firstParameterValue() {

        String value = queryString.getParameter("name");

        assertEquals("Alice", value); // The value for "name" is "Alice"

    }

    

    @Test

    public void middleParameterValue() {

        String value = queryString.getParameter("age");

        assertEquals("19", value); // The value for "age" is "19"

    }

    

    @Test

    public void lastParameterValue() {

        String value = queryString.getParameter("country");

        assertEquals("UK", value); // The value for "country" is "UK"

    }

    

    @Test

    public void missingParameterHasNullValue() {

        String value = queryString.getParameter("occupation");

        assertNull(value); // Missing parameter returns null

    }

    

    @Test

    public void emptyQueryString() {

        QueryString empty = new QueryString("");

        assertFalse(empty.hasParameter("name")); // No parameters in an empty query string

        assertNull(empty.getParameter("name")); // No value for any parameter in an empty query string

    }

    

    @Test

    public void decode() {

        String value = QueryString.decode("Hello%2C+world%21");

        assertEquals("Hello, world!", value); // "%2C" -> ",", "+" -> " ", "%21" -> "!"

    }

    

    @Test

    public void decodePlain() {

        String value = QueryString.decode("Alice");

        assertEquals("Alice", value); // No encoding, so the string remains unchanged

    }

    

    @Test

    public void encodedParameterValue() {

        QueryString encoded = new QueryString("message=Hello%2C+world%21");

        String value = encoded.getParameter("message");

        assertEquals("Hello, world!", value); // Decodes the encoded parameter value

    }

}