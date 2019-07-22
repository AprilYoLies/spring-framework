package top.aprilyolies.example.tx;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

/**
 * @Author EvaJohnson
 * @Date 2019-07-22
 * @Email g863821569@gmail.com
 */

@Transactional
public class UserServiceImpl implements UserService {
	private JdbcTemplate template = new JdbcTemplate();

	public void setDataSource(DataSource dataSource) {
		this.template.setDataSource(dataSource);
	}

	@Override
	public void save(User user) {
		template.update("insert into user(name,age,sex) values (?,?,?)", user.getName(), user.getAge(), user.getSex());
		throw new RuntimeException("Test tx");
	}
}
