import java.time.LocalDate;
import java.time.Period;

public class UserWebDtoBuilder implements UserDtoBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserDto userDto;

    @Override
    public UserDtoBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDtoBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDtoBuilder withBirthdate(LocalDate birthdate) {
        Period ageInYears = Period.between(birthdate, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", "
                + address.getStreet() + ", "
                + address.getCity() + ", "
                + address.getState() + ", "
                + address.getZipcode();
        return this;
    }

    @Override
    public UserDto build() {
        userDto = new UserWebDto(firstName + " " + lastName, address, age);
        return userDto;
    }

    @Override
    public UserDto getUserDto() {
        return userDto;
    }
}
