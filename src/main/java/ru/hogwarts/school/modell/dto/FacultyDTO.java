package ru.hogwarts.school.modell.dto;

public class FacultyDTO {
    private Long idFrontaDTO;
    private Long keyIdFacultyMapDTO;
    private Long counterFacultyDTO;
    private String nameFacultyDTO;

    public FacultyDTO() {// Для Джексона

    }

    public FacultyDTO(Long idFronta, Long keyFacultyMap, Long counterFaculty, String getFacultyName) {//?
        this.idFrontaDTO = idFronta;
        this.keyIdFacultyMapDTO = keyFacultyMap;
        this.counterFacultyDTO =counterFaculty;
        this.nameFacultyDTO = getFacultyName;
    }

    public Long getIdFrontaDTO() {
        return idFrontaDTO;
    }

    public void setIdFrontaDTO(Long idFronta) {
        this.idFrontaDTO = idFronta;
    }

    public Long getKeyIdFacultyMapDTO() {
        return keyIdFacultyMapDTO;
    }

    public void setKeyIdFacultyMapDTO(Long keyIdFacultyMapDTO) {
        this.keyIdFacultyMapDTO = keyIdFacultyMapDTO;
    }

    public Long getCounterFacultyDTO() {
        return counterFacultyDTO;
    }

    public void setCounterFacultyDTO(Long counterFacultyDTO) {
        this.counterFacultyDTO = counterFacultyDTO;
    }

    public String getNameFacultyDTO() {
        return nameFacultyDTO;
    }

    public void setNameFacultyDTO(String nameFacultyDTO) {
        this.nameFacultyDTO = nameFacultyDTO;
    }


}
