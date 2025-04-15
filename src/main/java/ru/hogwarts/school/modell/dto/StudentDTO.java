package ru.hogwarts.school.modell.dto;

public class StudentDTO {
    private Long idFrontaDTO;
    private Long keyIdStudentMapDTO;
    private Long counterStudentDTO;
    private String nameStudentDTO;

    public StudentDTO() {// Для Джексона

    }

    public StudentDTO(Long idFronta, Long keyStudentMap, Long counterStudent, String getStudentName) {//?
        this.idFrontaDTO = idFronta;
        this.keyIdStudentMapDTO = keyStudentMap;
        this.counterStudentDTO =counterStudent;
        this.nameStudentDTO = getStudentName;
    }

    public Long getIdFrontaDTO() {
        return idFrontaDTO;
    }

    public void setIdFrontaDTO(Long idFronta) {
        this.idFrontaDTO = idFronta;
    }

    public Long getKeyIdStudentMapDTO() {
        return keyIdStudentMapDTO;
    }

    public void setKeyIdStudentMapDTO(Long keyIdStudentMapDTO) {
        this.keyIdStudentMapDTO = keyIdStudentMapDTO;
    }

    public Long getCounterStudentDTO() {
        return counterStudentDTO;
    }

    public void setCounterStudentDTO(Long counterStudentDTO) {
        this.counterStudentDTO = counterStudentDTO;
    }

    public String getNameStudentDTO() {
        return nameStudentDTO;
    }

    public void setNameStudentDTO(String nameStudentDTO) {
        this.nameStudentDTO = nameStudentDTO;
    }

}
