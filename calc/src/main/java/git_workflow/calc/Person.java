package git_workflow.calc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Name")
   private java.lang.String name;

   public Person()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public Person(java.lang.String name)
   {
      this.name = name;
   }

}