package fitnessclub.entity;

/**
 *
 * @author magni
 */
public enum ApplicationState {
    INITIAL, //1
    CREATED, //2
    DOCTOR_ASSIGNED, //3
    HEALTH_STATUS_OK, //...
    CONTRACT_OFFERED,
    CLIENT_AGREED,
    CLIENT_REGISTERED,
    COACH_REQUESTED,
    FORM_OFFERED,
    FORM_FILLED,
    PROGRAM_ASSIGNED    //11
}