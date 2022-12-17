package com.Centralita1.Centralita1;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AccesingDataJpaApplication implements CommandLineRunner {
	 
	@Autowired
    private DepartamentoRepository departamentoRepository;
	@Autowired
  	private MotivoRepository motivoRepository;
	@Autowired
  	private RegistroRepository registroRepository;
	@Autowired
  	private RolRepository rolRepository;
	@Autowired
  	private UserRepository userRepository;
	
	public static void main(String[] args) {
	SpringApplication.run(AccesingDataJpaApplication.class, args);
}
@Override
public void run(String... args) throws Exception  {
	
	
	//Creamos motivo
	Motivo motivo1=new Motivo("Queja", new ArrayList<Registro>());
	motivoRepository.save(motivo1);
	//Creamos roles
	Rol rol1=new Rol("Jefe", new ArrayList<User>());
	Rol rol2=new Rol("Teleoperador", new ArrayList<User>());
	//Creamos un departamento
	Departamento dep1=new Departamento("Ventas", "2342145",new ArrayList<User>());
	rolRepository.save(rol1);
	rolRepository.save(rol2);
	departamentoRepository.save(dep1);
	//Creamos usuarios
	User user1= new User("Paul","12345","paul@gmail.com","xbbbbx", dep1, rol1, new ArrayList<Registro>(),new ArrayList<Registro>());
	userRepository.save(user1);
	User user2= new User("Rodrigo","12345","Rodrigo@gmail.com","xvvvx", dep1, rol2, new ArrayList<Registro>(),new ArrayList<Registro>());
	userRepository.save(user2);
	//Finalmente creamos un registro
	Registro registro1=new Registro(LocalDateTime.now(),"pepe","fempa",user2,user1,"sin observaciones","233573",motivo1);
	registroRepository.save(registro1);
	
	
	
}
}
