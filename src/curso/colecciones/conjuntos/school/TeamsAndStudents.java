package curso.colecciones.conjuntos.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*
 * El equipo de fútbol-sala de la 3ª clase del instituto Megalío está formado por 
 * Pedro, Diego, Hugo, Carlos, Roberto, Rolando y Edgar.
 * El equipo de Olimpiadas de Matemáticas de dicha clase está formado por 
 * Andrea, Diego, Cristina, José, Rolando y Edgar.

 * ¿Quiénes están en ambos equipos? 
 * ¿Quiénes están en al menos uno de los dos equipos? 
 * ¿Quiénes están en el equipo de fútbol-sala pero no en el de las olimpiadas? 
 * ¿Quiénes están únicamente en el equipo de las olimpiadas? 
 * ¿Quiénes están sólo en uno de esos dos equipos? 
 * */
public class TeamsAndStudents {
   
    private Map<Team, Set<Student>> teams;
   
   public TeamsAndStudents(){
       teams = new HashMap<>();
       
       Team futbolSala = new Team("Futbol Sala");
       Team matematicas = new Team("Olimpiadas de matemáticas");
       
       teams.put(futbolSala, getStudentsByTeam(futbolSala.getName()));
       teams.put(matematicas, getStudentsByTeam(matematicas.getName()));
   }
   
    
    public Map<Team, Set<Student>> getTeams(){
        return teams;
    }
   
   private Set<Student> getStudentsByTeam(String teamName) {
       Set<Student> studentsByTeam = new LinkedHashSet<>(getStudents());
//       
//       for (Iterator<Student> iter = studentsByTeam.iterator(); iter.hasNext(); ) {
//           Student student = iter.next();
//           if (!student.getTeams().contains(teamName)) {
//               iter.remove();
//                       
//           }
//       }
//       
       studentsByTeam.removeIf(student -> !student.getTeams().contains(teamName));
       
       return studentsByTeam;
   }
   
   private Collection<Student> getStudents(){
        
        Collection<Student> students = new ArrayList<>();
        
        students.add(
                new Student(
                        "Pedro", 
                        Arrays.asList("Futbol Sala")
                )
        );
   
        students.add(
                new Student(
                        "Diego", 
                        Arrays.asList("Futbol Sala", "Olimpiadas de matemáticas")
                )
        );
        
        
        students.add(new Student("Hugo", Arrays.asList("Futbol Sala")));
        students.add(new Student("Carlos", Arrays.asList("Futbol Sala")));
        students.add(new Student("Roberto", Arrays.asList("Futbol Sala")));
        students.add(new Student("Rolando", Arrays.asList("Futbol Sala", "Olimpiadas de matemáticas")));
        students.add(new Student("Edgar", Arrays.asList("Futbol Sala", "Olimpiadas de matemáticas")));
        students.add(new Student("Andrea", Arrays.asList("Olimpiadas de matemáticas")));
        students.add(new Student("Cristina", Arrays.asList("Olimpiadas de matemáticas")));
        students.add(new Student("José", Arrays.asList("Olimpiadas de matemáticas")));
        
        students.add(new Student("Germán", Arrays.asList("Softball")));
        students.add(new Student("Sara", Arrays.asList("Ajedrez", "Decathlon")));
        students.add(new Student("Concepción", Arrays.asList("Softball")));
        
        return students;
    }
   
    public static void main(String[] args) {
        TeamsAndStudents tas = new TeamsAndStudents();
        Map<Team, Set<Student>> teams = tas.getTeams();
        Team futbolSala = new Team("Futbol Sala");
        Team matematicas = new Team("Olimpiadas de matemáticas");
        
        //¿Quiénes están en al menos uno de los dos equipos?
        Set<Student> enDosEquipos = new LinkedHashSet<>(teams.get(futbolSala));
        enDosEquipos.addAll(teams.get(matematicas));
        System.out.println("Estudiantes en al menos uno de los dos equipos: ");
        System.out.println(enDosEquipos);
        System.out.println("\n");
        
        
        //////////////////////////////////////////////////////////////////////////
        // ¿Quiénes están en el equipo de fútbol-sala pero no en el de las olimpiadas de matemáticas? 
        Set<Student> soloFutbol = new LinkedHashSet<>(teams.get(futbolSala));
        soloFutbol.removeAll(teams.get(matematicas));
        System.out.println("Estudiantes solamente en el equipo de futbol: ");
        System.out.println(soloFutbol);
        System.out.println("\n");
        
        
        ////////////////////////////////////////////////////////////////////////
        // ¿Quiénes están únicamente en el equipo de las olimpiadas de matemáticas? 
        Set<Student> soloMatematicas = new LinkedHashSet<>(teams.get(matematicas));
        soloMatematicas.removeAll(teams.get(futbolSala));
        System.out.println("Estudiantes solamente en el equipo de matemáticas: ");
        System.out.println(soloMatematicas);
    }
}