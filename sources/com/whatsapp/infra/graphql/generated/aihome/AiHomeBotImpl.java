package com.whatsapp.infra.graphql.generated.aihome;

import X.C18070vi;
import X.C20125A8k;
import org.json.JSONObject;

public final class AiHomeBotImpl extends C20125A8k implements AiHomeBot {

    public final class Creator extends C20125A8k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Creator(JSONObject jSONObject) {
            super(jSONObject);
            C18070vi.A0d(jSONObject, 1);
        }
    }

    public final class Persona extends C20125A8k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Persona(JSONObject jSONObject) {
            super(jSONObject);
            C18070vi.A0d(jSONObject, 1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeBotImpl(JSONObject jSONObject) {
        super(jSONObject);
        C18070vi.A0d(jSONObject, 1);
    }

    public Persona BX1() {
        return (Persona) A09(Persona.class, "persona");
    }
}
