package layout

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ViaCepService {
    @GET("{cep}/json/")
    fun getCepData(@Path("cep") cep: String): Call<CepResponse>
}

data class CepResponse(
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ibge: String,
    val gia: String,
    val ddd: String,
    val siafi: String
)
