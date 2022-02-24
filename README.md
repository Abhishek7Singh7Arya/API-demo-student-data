# API-demo-student-data
This is the basic API demo of student data. 
This is the basic api demo of student data.
check point    http://localhost:8080/api/hello

GET      http://localhost:8080/api/hello

PUT  http://localhost:8080/api/hello/STUDENTID?name=UPDATEDNAME&email=UPDATEDEMAIL

OR

http://localhost:8080/api/hello/STUDENTID?name=UPDATEDNAME

OR

http://localhost:8080/api/hello/STUDENTID?email=UPDATEDEMAIL

DELETE  http://localhost:8080/api/hello/STUDENTID


POST   http://localhost:8080/api/hello/


{
    "dob":"YYYY-MM-DD","email":"YOUR_EMAIL_ID","name":"YOUR_NAME"
}


IF MAIL ID IS ALREADY EXIST IT GIVE STATUS 500 AND MESSAGE "EMAIL EXISTS".
