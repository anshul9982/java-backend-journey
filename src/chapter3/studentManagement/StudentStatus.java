package chapter3.studentManagement;

public enum StudentStatus {
            ACTIVE("Currently enrolled and attending classes"),
            INACTIVE("Not currently enrolled"),
            GRADUATED("Has completed all degree requirements"),
            SUSPENDED("Temporarily unable to attend classes");

            private final String description;
            private StudentStatus(String description){
                this.description = description;
            }




    public String getDescription(){
                return description;
            }
}
