import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = createUser();
        UserDtoBuilder builder = new UserWebDtoBuilder();

        UserDto dto = directBuild(builder, user);
        System.out.println(dto.toString());
    }

    private static UserDto directBuild(UserDtoBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthdate(user.getBirthDate()).build();
    }

    public static User createUser() {
        User user = new User();
        user.setBirthDate(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setCity("San Francisco");
        address.setState("CA");
        address.setHouseNumber("123");
        address.setStreet("State Street");
        address.setZipcode("123456");
        user.setAddress(address);
        return user;
    }
}