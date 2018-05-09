public class Persona
{
   private final String apellido;
   private final String nombre;


   public Persona(
      final String newApellido,
      final String newNombre)
   {
      this.apellido = newApellido;
      this.nombre = newNombre;
   }

   public static class PersonaBuilder
   {
      private String nestedApellido;
      private String nestedNombre;


      public PersonaBuilder(final String newNombre) 
      {
         this.nestedNombre = newNombre;
      }

      public PersonaBuilder apellido(String newApellido)
      {
         this.nestedApellido = newApellido;
         return this;
      }     

      public Persona createPersona()
      {
         return new Persona(
            nestedApellido, nestedNombre);
      }
   }
}
