document.getElementById("employeeForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevents page reload

    const empId = document.getElementById("empId").value;
    const empName = document.getElementById("empName").value;
    const email = document.getElementById("email").value;
    const dob = document.getElementById("dob").value;
    const address = document.getElementById("address").value;
    const mobile = document.getElementById("mobile").value;

    console.log("Employee ID:", empId);
    console.log("Employee Name:", empName);
    console.log("Email:", email);
    console.log("DOB:", dob);
    console.log("Address:", address);
    console.log("Mobile No:", mobile);

    // Display on screen
    document.getElementById("output").innerHTML = `
        Employee ID: ${empId} <br>
        Employee Name: ${empName} <br>
        Email: ${email} <br>
        DOB: ${dob} <br>
        Address: ${address} <br>
        Mobile No: ${mobile}
    `;

    alert(`Details Retrieved:
    Employee ID: ${empId}
    Name: ${empName}
    Email: ${email}
    DOB: ${dob}
    Address: ${address}
    Mobile: ${mobile}`);
});
