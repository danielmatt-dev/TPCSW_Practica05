package org.uv.TPCSW_Practica05.JWT;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

interface UsuarioRepository extends JpaRepository<Usuario, Long>{
 
    public Optional<Usuario> findByEmail(String email);
    
    public Usuario save(Usuario usuario);
    
}
