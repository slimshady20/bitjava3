package com.jse.phone;

public class PhoneServiceImpl implements PhoneService {
	private Phone[] phones;
	private CellPhone[] cellPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	private int count;
	
	 public PhoneServiceImpl() {
		phones = new Phone[3];
		cellPhones= new CellPhone[3];
		iphones= new Iphone[3];
		galaxyNotes= new GalaxyNote[3];
		count = 0;
	 }
	
	@Override
	public void add(Phone phone) {
		phones[count]= phone;
		count++;
		
	}

	@Override
	public Phone list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone detail(Phone phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Phone phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(CellPhone cellphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CellPhone cList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CellPhone detail(CellPhone cellphone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CellPhone cellphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CellPhone cellphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iphone IphoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iphone detail(Iphone iphone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(GalaxyNote galaxynote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GalaxyNote galaxyNotelist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GalaxyNote detail(GalaxyNote galaxynote) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(GalaxyNote galaxynote) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(GalaxyNote galaxynote) {
		// TODO Auto-generated method stub
		
	}

	

}
