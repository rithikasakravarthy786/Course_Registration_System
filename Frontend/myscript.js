function showcourses(){
   fetch("http://localhost:8080/courses") // API end point
   .then((response) => response.json()) // http response into json object
   .then((courses) => {
    const dataTable= document.getElementById("coursetable")

courses.forEach(course => {
    var row= `<tr>
        <td>${course.courseId}</td>
        <td>${course.coursename}</td>
        <td>${course.trainer}</td>
        <td>${course.durationinweeks}</td>
        </tr>`

        dataTable.innerHTML+=row;

});
 });
}

function showEnrolledStudents(){
   fetch("http://localhost:8080/courses/enrolled") // API end point
   .then((response) => response.json()) // http response into json object
   .then((students) => {
    const dataTable= document.getElementById("enrolledtable")

students.forEach(student => {
    var row= `<tr>
        <td>${student.name}</td>
        <td>${student.mailid}</td>
        <td>${student.coursename}</td>
        
        
        </tr>`

        dataTable.innerHTML+=row;

});
 });
}