import java.time.LocalDate;

public interface UserDtoBuilder {
    UserDtoBuilder withFirstName(String firstName);
    UserDtoBuilder withLastName(String lastName);
    UserDtoBuilder withBirthdate(LocalDate birthdate);
    UserDtoBuilder withAddress(Address address);
    //the method to assemble the final product
    UserDto build();
    //(optional) method to fetch the already built object
    UserDto getUserDto();
}
