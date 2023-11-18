import java.time.DayOfWeek
import java.time.format.TextStyle
import java.util.Locale

object MensagemDiaSemana {

  def main(args: Array[String]): Unit = {
    // Obtendo o dia atual da semana
    val diaAtual = java.time.LocalDate.now().getDayOfWeek

    // Obtendo o nome do dia da semana
    val nomeDiaSemana = diaAtual.getDisplayName(TextStyle.FULL, Locale("pt", "BR"))

    // Exibindo a mensagem com base no dia da semana
    val mensagem = nomeDiaSemana match {
      case "sábado" => "Dia de relaxar e aproveitar o fim de semana 😊! Não se esqueça de estudar 🤨"
      case "domingo" => "Dia de descanso e recarregar as energias! 🌞"
      case "segunda-feira" => "Dia de recomeçar e iniciar a semana com disposição! 💪"
      case "terça-feira" | "quarta-feira" | "quinta-feira" => "Bom dia! Mais um dia para progredir nos seus objetivos! 🚀"
      case "sexta-feira" => "Dia de se preparar para o fim de semana! Sextoooouuu! 🎉"
      case _ => "Dia comum, aproveite-o da melhor maneira possível! 😊"
    }

    // Exibindo a mensagem de acordo com o dia da semana
    println(s"Hoje é $nomeDiaSemana.")
    println(mensagem)
  }
}
