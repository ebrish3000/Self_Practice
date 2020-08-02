package day11_WarmUpTask;
/*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
Some of the codes and their meanings are listed below:
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement
 */
public class StatusCode {
    public static void main(String[] args) {
        int code = 100;
        String statusCode = "";

        if(code==200){
            statusCode = "Ok";
        } else if( code==201 ){
            statusCode = "Created";
        } else if(code==202){
            statusCode = "Accepted";
        } else if(code==301){
            statusCode = "Moved Permanently";
        } else if(code==303){
            statusCode = "See Other";
        }else if( code==304 ){
            statusCode = "Not Modified";
        } else if(code==307){
            statusCode = "Temporary Redirect";
        } else if(code==400){
            statusCode = "Bad Request";
        } else if(code==401){
            statusCode = "Unauthorized";
        }else if( code==403 ){
            statusCode = "Forbidden";
        } else if(code==404){
            statusCode = "Not Found";
        } else if(code==410){
            statusCode = "Gone";
        } else if(code==500){
            statusCode = "Internal Server Error";
        }else if (code==503){
            statusCode = "Service Unavailable";
        } else{
            statusCode = "Invalid";
        }

        System.out.println("It is showing "+ statusCode);

    }
}
