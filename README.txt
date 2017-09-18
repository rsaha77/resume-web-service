Steps to run this project

0. Run the file src/test/java/../ResumeServiceImplTest.java to test the working.

1. Run: mvn clean install eclipse:clean eclipse:eclipse

2. Run: mvn spring-boot:run

3. Use extention like RESTLET CLIENT to use post and get request

4. Example of post request.
  Method: POST
  URI: http://localhost:8080/api/uploadResumeDetails
  Content-Type: application/json
  BODY:  {
           "name": "Rana",
           "currJobTitle": "SEr",
           "currJobDescription": "Full Stack",
           "currJobCompany": "WorksAp"
         }
  
  The above query returns the Resume Id.
  
5. Example of get request.
  Method: GET
  URI: http://localhost:8080/api/getResume?id=1
  Query Param: id = 1
  
  Returns the uploaded resume if it exists corresponding to the resume id, else returns nothing.