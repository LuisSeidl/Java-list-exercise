public class Person implements Comparable{
    private String name;
    private int size;
    private Job job;

    public Person(String name, int size, Job job) {
        this.name = name;
        this.size = size;
        this.job = job;
    }

    public String getName(){
        return this.name;
    }
    public int getSize(){
        return this.size;
    }
    public Job getJob(){
        return this.job;
    }

    public void print(){
        System.out.println(this.name + " is " + this.size + "cm tall and makes " + this.job.getSalary() + "€");
    }
    public int compareTo(Object o){
        if (o instanceof Person other) {

            if (this.size < other.getSize()) {
                return 1;
            }
            if (this.size > other.getSize()) {
                return -1;
            }
            if (this.job.getSalary() > other.getJob().getSalary()) {
                return 1;
            }
            if (this.job.getSalary() < other.getJob().getSalary()) {
                return -1;
            }
            return 0;
        }
        return 0;
    }

}


