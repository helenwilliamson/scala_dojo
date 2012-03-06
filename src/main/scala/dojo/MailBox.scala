package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case Ping => Pong
    case Pong => Ping
  }

  def receive(msg: Any) =
  {
    val something = "echo"
    msg match {
    case pingPong:PingPongMessage => handleMsg(pingPong)
    case "stop" => "stopped"
    case (something, echoMessage) => echoMessage
  }
  }


}
