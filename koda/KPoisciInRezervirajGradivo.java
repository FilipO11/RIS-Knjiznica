/***********************************************************************
 * Module:  KPoisciInRezervirajGradivo.java
 * Author:  Filip
 * Purpose: Defines the Class KPoisciInRezervirajGradivo
 ***********************************************************************/

import java.util.*;

/** @pdOid 40e15327-d8ce-43d2-9067-8cbae23287f6 */
public class KPoisciInRezervirajGradivo {
   /** @pdRoleInfo migr=no name=SvSistemEposte assc=association2 mult=0..1 */
   public SvSistemEposte svSistemEposte;
   /** @pdRoleInfo migr=no name=SvCobiss assc=association3 mult=0..1 */
   public SvCobiss svCobiss;
   /** @pdRoleInfo migr=no name=Rezervacija assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Rezervacija> rezervacija;
   /** @pdRoleInfo migr=no name=Gradivo assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Gradivo> gradivo;
   /** @pdRoleInfo migr=no name=SvBancniSistem assc=association7 mult=0..1 */
   public SvBancniSistem svBancniSistem;
   
   /** @pdOid 0d03c3d4-26aa-4dd9-9159-224b3c186f38 */
   public int vrniSeznamIskanihGradiv() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 9a9c97e3-40a6-478f-810c-751c1e67e06c */
   public int vrniPodrobnostiGradiva() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid dd5cdb51-2713-4e87-b627-0a243fb85cd2 */
   public int rezervirajGradivo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 0881b791-7670-49f7-9255-36c1c5945c0f */
   public int vrniGradivo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid d8c09ff4-c07f-46f7-a2c1-9641309b2ca8 */
   public int placajZamudnino() {
      // TODO: implement
      return 0;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Rezervacija> getRezervacija() {
      if (rezervacija == null)
         rezervacija = new java.util.HashSet<Rezervacija>();
      return rezervacija;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRezervacija() {
      if (rezervacija == null)
         rezervacija = new java.util.HashSet<Rezervacija>();
      return rezervacija.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRezervacija */
   public void setRezervacija(java.util.Collection<Rezervacija> newRezervacija) {
      removeAllRezervacija();
      for (java.util.Iterator iter = newRezervacija.iterator(); iter.hasNext();)
         addRezervacija((Rezervacija)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRezervacija */
   public void addRezervacija(Rezervacija newRezervacija) {
      if (newRezervacija == null)
         return;
      if (this.rezervacija == null)
         this.rezervacija = new java.util.HashSet<Rezervacija>();
      if (!this.rezervacija.contains(newRezervacija))
         this.rezervacija.add(newRezervacija);
   }
   
   /** @pdGenerated default remove
     * @param oldRezervacija */
   public void removeRezervacija(Rezervacija oldRezervacija) {
      if (oldRezervacija == null)
         return;
      if (this.rezervacija != null)
         if (this.rezervacija.contains(oldRezervacija))
            this.rezervacija.remove(oldRezervacija);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRezervacija() {
      if (rezervacija != null)
         rezervacija.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Gradivo> getGradivo() {
      if (gradivo == null)
         gradivo = new java.util.HashSet<Gradivo>();
      return gradivo;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGradivo() {
      if (gradivo == null)
         gradivo = new java.util.HashSet<Gradivo>();
      return gradivo.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGradivo */
   public void setGradivo(java.util.Collection<Gradivo> newGradivo) {
      removeAllGradivo();
      for (java.util.Iterator iter = newGradivo.iterator(); iter.hasNext();)
         addGradivo((Gradivo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGradivo */
   public void addGradivo(Gradivo newGradivo) {
      if (newGradivo == null)
         return;
      if (this.gradivo == null)
         this.gradivo = new java.util.HashSet<Gradivo>();
      if (!this.gradivo.contains(newGradivo))
         this.gradivo.add(newGradivo);
   }
   
   /** @pdGenerated default remove
     * @param oldGradivo */
   public void removeGradivo(Gradivo oldGradivo) {
      if (oldGradivo == null)
         return;
      if (this.gradivo != null)
         if (this.gradivo.contains(oldGradivo))
            this.gradivo.remove(oldGradivo);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGradivo() {
      if (gradivo != null)
         gradivo.clear();
   }

}