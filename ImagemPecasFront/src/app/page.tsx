import { PrimeiroComponente } from "../components/PrimeiroComponente";

export default function Home() {
  return (
    <PrimeiroComponente 
      mensagem="Olá, este é o meu componente!" 
      mensagemBotao="Texto que vai aparecer no console.log" 
    />
  );
}
