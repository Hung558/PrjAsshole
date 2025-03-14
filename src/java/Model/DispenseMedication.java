
package Model;

public class DispenseMedication {
    private String ID;
    private int requestQuantity, dispenseQuantity;
    private String requestDate, dispenseDate, employeeID, employeeName;

    public DispenseMedication() {
    }

    public DispenseMedication(String ID, int requestQuantity, int dispenseQuantity, String requestDate, String dispenseDate, String employeeID, String employeeName) {
        this.ID = ID;
        this.requestQuantity = requestQuantity;
        this.dispenseQuantity = dispenseQuantity;
        this.requestDate = requestDate;
        this.dispenseDate = dispenseDate;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getID() {
        return ID;
    }

    public int getRequestQuantity() {
        return requestQuantity;
    }

    public int getDispenseQuantity() {
        return dispenseQuantity;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public String getDispenseDate() {
        return dispenseDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setRequestQuantity(int requestQuantity) {
        this.requestQuantity = requestQuantity;
    }

    public void setDispenseQuantity(int dispenseQuantity) {
        this.dispenseQuantity = dispenseQuantity;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public void setDispenseDate(String dispenseDate) {
        this.dispenseDate = dispenseDate;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "DispenseMedication{" + "ID=" + ID + ", requestQuantity=" + requestQuantity + ", dispenseQuantity=" + dispenseQuantity + ", requestDate=" + requestDate + ", dispenseDate=" + dispenseDate + ", employeeID=" + employeeID + ", employeeName=" + employeeName + '}';
    }

}
