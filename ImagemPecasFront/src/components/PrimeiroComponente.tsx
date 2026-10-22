'use client';

import React from 'react';

interface PrimeiroComponenteProps {
    mensagem: string;
    mensagemBotao: string;
}

export const PrimeiroComponente: React.FC<PrimeiroComponenteProps> = (props) => {
    
    function handleClick() {
        console.log('props.mensagemBotao'); 
    }

    return (
        <div>
            Primeiro Componente
                        
            <button onClick={handleClick}>Clique Aqui</button> 
        </div>
        
    );
};

