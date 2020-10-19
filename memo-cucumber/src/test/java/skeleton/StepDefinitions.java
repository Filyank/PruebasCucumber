package skeleton;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions{
  Ejercicio corrida = new Ejercicio();

  @Given("^Correr (\\d+) km$")
  public void correr_km(int kilometros) throws Throwable {

      corrida.setKilometros(kilometros);

  }
    @Given("^No ejercito$")
    public void no_ejercito() throws Throwable {
        corrida.setKilometros(0);

    }
  @When("^Quemo (\\d+) calorias por km$")
  public void quemo_calorias_por_km(int caloriasPorKilometro) throws Throwable {
      corrida.setCalorias(caloriasPorKilometro);
  }

  @Then("^Quemo en total (\\d+) calorias$")
  public void quemo_calorias(int caloriasEsperadas) throws Throwable {
      assertEquals(corrida.getCaloriasFinales(0), caloriasEsperadas);
  }

  @Then("^Como un sandwich de (\\d+) calorias y quemo en total (\\d+) calorias$")
  public void como_un_sandwich_de_calorias_y_quemo_en_total_calorias(int caloriasIngeridas, int caloriasEsperadas) throws Throwable {
      assertEquals(corrida.getCaloriasFinales(caloriasIngeridas), caloriasEsperadas);
  }
  @Then("^Como un sandwich de (\\d+) calorias y quemo en total -(\\d+) calorias$")
  public void como_un_sandwich_de_calorias_y_quemo_en_total_menoscalorias(int caloriasIngeridas, int caloriasEsperadas) throws Throwable {
      assertEquals(corrida.getCaloriasFinales(caloriasIngeridas), caloriasEsperadas);
  }
}
