package mini;

public class Line {
	private Cell[] cells;
	
	public Line (Cell cell1,Cell cell2,Cell cell3) {
		this.cells = new Cell[] {cell1,cell2,cell3}; 
		
			
		}
	public boolean checkLine() {
		int mark1 = cells[0].getMark();
		int mark2 = cells[1].getMark();
		int mark3 = cells[2].getMark();
		boolean l =true;
		if(mark1 == 2) {
			l=false;
		}else {
			if(mark1 == mark2 && mark1 == mark3) {
				l=true;
				
			}else {
				l=false;
				
			}
		}
			return l;
				
		
	}	



}



		


	
