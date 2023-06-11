using Guia_Centros_Estudio_Superior.Core.Models;

namespace Guia_Centros_Estudio_Superior.Core.Contracts.Services;

// Remove this class once your pages/features are using your data.
public interface ISampleDataService
{
    Task<IEnumerable<InstitucionEducacion>> GetContentGridDataAsync();
    Task<IEnumerable<Instituto>> GetContentGridDataInstitutoAsync();
    Task<IEnumerable<Universidad>> GetContentGridDataUniversidadAsync();
    Task<IEnumerable<InstitucionEducacion>> GetGridDataAsync();
    Task<IEnumerable<InstitucionEducacion>> GetListDetailsDataAsync();
}
