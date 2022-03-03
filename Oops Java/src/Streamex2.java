import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

class ParticipantUtility {
    private List<Participant> participantList = new ArrayList<>();

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<Participant> participantList) {
        this.participantList = participantList;
    }

    public void addParticipant(Participant participant) {
        participantList.add(participant);
    }

    public Stream<Participant> viewAllParticipants(String departmentName, String collegeName) {
        return participantList.stream()
                .filter(participant -> participant.getCollegeName().equals(collegeName) &&
                        participant.getDepartmentName().equals(departmentName))
                .sorted(Comparator.comparing(Participant::getParticipantName));
    }
}

class Participant {
    private String participantName;
    private String departmentName;
    private String collegeName;

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return participantName + " " + departmentName + " " + collegeName;
    }
}

public class Streamex2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParticipantUtility participantUtility = new ParticipantUtility();
        int option = 0;

        do {
            System.out.println("1.Add\n2.View\n3.Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1: {
                    String participantName = scanner.nextLine();
                    String departmentName = scanner.nextLine();
                    String collegeName = scanner.nextLine();

                    Participant participant = new Participant();
                    participant.setParticipantName(participantName);
                    participant.setDepartmentName(departmentName);
                    participant.setCollegeName(collegeName);
                    participantUtility.addParticipant(participant);

                    break;
                }
                case 2: {
                    System.out.println("Enter department name");
                    String departmentName = scanner.nextLine();
                    System.out.println("Enter college name");
                    String collegeName = scanner.nextLine();

                    Stream<Participant> filteredParticipantStream = participantUtility.viewAllParticipants(departmentName, collegeName);
                    filteredParticipantStream.forEach(System.out::println);

                    break;
                }
                case 3: {
                    System.out.println("Thank you for using the application");
                    break;
                }
                default: {
                    System.out.println("Please choose a correct option");
                    break;
                }
            }
        } while (option != 3);
    }
}
