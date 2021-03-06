package co.com.seguridog

import grails.validation.Validateable

@Validateable
class K9Instructor extends K9User {
    String approvedCourse
    Date dateApproved
    Date dateCredentials
    String specialities

    static hasMany = [exercicesabilities: ExerciseAbility]

    static constraints = {
        approvedCourse (blank: false)
        dateApproved (blank: false)
        dateCredentials (blank: false)
        specialities (blank: false)
    }

}
