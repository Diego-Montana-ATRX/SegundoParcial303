package crud;

public class alumno {

		String numControl;
		String alumno;		
		String apellidopate;
		String apellidomate;
		String grupo;
		String carrera;
		String turno;
		public alumno(String nomControl, String alumno, String apellidopate, String apellidomate, String grupo,
				String carrera, String turno) {
			super();
			this.numControl = nomControl;
			this.alumno = alumno;
			this.apellidopate = apellidopate;
			this.apellidomate = apellidomate;
			this.grupo = grupo;
			this.carrera = carrera;
			this.turno = turno;
		}
		public alumno() {
		
		}
		public String getNomControl() {
			return numControl;
		}
		public void setNomControl(String nomControl) {
			this.numControl = nomControl;
		}
		public String getAlumno() {
			return alumno;
		}
		public void setAlumno(String alumno) {
			this.alumno = alumno;
		}
		public String getApellidopate() {
			return apellidopate;
		}
		public void setApellidopate(String apellidopate) {
			this.apellidopate = apellidopate;
		}
		public String getApellidomate() {
			return apellidomate;
		}
		public void setApellidomate(String apellidomate) {
			this.apellidomate = apellidomate;
		}
		public String getGrupo() {
			return grupo;
		}
		public void setGrupo(String grupo) {
			this.grupo = grupo;
		}
		public String getCarrera() {
			return carrera;
		}
		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}
		public String getTurno() {
			return turno;
		}
		public void setTurno(String turno) {
			this.turno = turno;
		}
		public void imprimirAlumno() {
			System.out.println(numControl+"\t"+alumno+" "+ apellidopate+" "+ apellidomate+"\t"+grupo+" ");
		}
		}
		
	


