package models;

public class Student {
    private int studentId;
    private String name;
    private String dob;
    private String program;
    private int year;
    private String contact;
    private String email;
    private String password;

    // Constructor with all fields (for retrieving data)
    public Student(int studentId, String name, String dob, String program, int year, String contact, String email, String password) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.program = program;
        this.year = year;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }

    // Constructor for registration (without studentId)
    public Student(String name, String dob, String program, int year, String contact, String email, String password) {
        this.name = name;
        this.dob = dob;
        this.program = program;
        this.year = year;
        this.contact = contact;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
