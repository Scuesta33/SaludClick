package com.SaludClick.SaludClick.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SaludClick.SaludClick.Repository.CitaRepository;
import com.SaludClick.SaludClick.model.Cita;
@Service
public class CitaService implements ICitaService {
 private final CitaRepository citaRepository;
 
 @Autowired
 public CitaService(CitaRepository citaRepository) {
     this.citaRepository = citaRepository;
 }

@Override
public Cita crearCita(Cita cita) {
	return citaRepository.save(cita);
}

@Override
public Optional<Cita> obtenerCitaPorId(Long id) {
	return citaRepository.findById(id);
}

@Override
public List<Cita> listarCitas() {
	return citaRepository.findAll();
}

@Override
public Cita actualizarCita(Cita cita) {
	return citaRepository.save(cita);
}

@Override
public void eliminarCita(Long id) {
	citaRepository.deleteById(id);
	
}

 
}
 
 

