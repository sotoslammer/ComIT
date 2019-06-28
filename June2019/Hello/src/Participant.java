public class Participant {
    private int photoId;
    private char sex;
    private boolean hasJob;
    private int salary;

    public Participant(int photoId, char sex, boolean hasJob, int salary) {
        this.photoId = photoId;
        this.sex = sex;
        this.hasJob = hasJob;
        this.salary = salary;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
