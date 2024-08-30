package ci.digitalacademy.MonEtab_v14.Service.mapper;

public interface EntityMapper <D, E>{
    D toDto(E entity);
    E toEntity(D dto);
}
