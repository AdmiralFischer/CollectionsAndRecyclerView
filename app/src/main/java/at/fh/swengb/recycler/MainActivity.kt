package at.fh.swengb.recycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = listOf(Student("Ape",93),
            Student("Julian",3),
            Student("Alex",4),
            Student("Andreas",1),
            Student("Lorenz",2))

        val elementList = list[1]
        println(message = elementList)

        val mutList = mutableListOf(Student("tower",93),
            Student("Julian",3),
            Student("Alex",4),
            Student("Andreas",1),
            Student("Lorenz",2))

        val elementMutList = mutList[2]
        println (message = "NAME:"+ elementMutList.name +"    SEMESTER:" + elementMutList.currentSemester)

        val set = setOf(Student("tower",93),
            Student("Julian",3),
            Student("Julian",3),
            Student("Andreas",1),
            Student("Lorenz",2))
        val elementSet = set

        val mutableSet = mutableSetOf(Student("tower",93),
            Student("Hulian",3),
            Student("Rob",1),
            Student("Hulian",3),
            Student("Lorenz",2))
        val elementMutSet = mutableSet

        println (message = "NAME:"+ elementMutSet.name +"    SEMESTER:" + elementMutSet.currentSemester)



    }
}

    private fun studentMap() {
        val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
        val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
        val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

        val s = Student("Test",3)

        for((key,value)in studentMap) {
            for (student in value) {
                Log.i("MyActivity", "$key, ${student,name}, ${student.currentSemester}")
            }
        }

    }

open class Student(val name: String, val currentSemester: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (name != other.name) return false
        if (currentSemester != other.currentSemester) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + currentSemester
        return result
    }


}