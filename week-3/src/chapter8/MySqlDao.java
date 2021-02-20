package chapter8;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql db에서 선택");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("MySql db에서 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql db에서 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql db에서 삭제");
	}

}
