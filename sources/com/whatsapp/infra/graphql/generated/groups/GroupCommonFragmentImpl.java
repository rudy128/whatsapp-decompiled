package com.whatsapp.infra.graphql.generated.groups;

import X.C18070vi;
import X.C20125A8k;
import X.C72453Mb;
import org.json.JSONObject;

public final class GroupCommonFragmentImpl extends C20125A8k {

    public final class Creator extends C20125A8k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Creator(JSONObject jSONObject) {
            super(jSONObject);
            C18070vi.A0d(jSONObject, 1);
        }
    }

    public final class Description extends C20125A8k {

        public final class Creator extends C20125A8k {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Creator(JSONObject jSONObject) {
                super(jSONObject);
                C18070vi.A0d(jSONObject, 1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Description(JSONObject jSONObject) {
            super(jSONObject);
            C18070vi.A0d(jSONObject, 1);
        }
    }

    public final class Participants extends C20125A8k {

        public final class Edges extends C20125A8k {

            public final class Node extends C20125A8k {
                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Node(JSONObject jSONObject) {
                    super(jSONObject);
                    C18070vi.A0d(jSONObject, 1);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Edges(JSONObject jSONObject) {
                super(jSONObject);
                C18070vi.A0d(jSONObject, 1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Participants(JSONObject jSONObject) {
            super(jSONObject);
            C18070vi.A0d(jSONObject, 1);
        }
    }

    public final class Subject extends C20125A8k {

        public final class Creator extends C20125A8k {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Creator(JSONObject jSONObject) {
                super(jSONObject);
                C18070vi.A0d(jSONObject, 1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Subject(JSONObject jSONObject) {
            super(jSONObject);
            C18070vi.A0d(jSONObject, 1);
        }

        public String A0H() {
            return C72453Mb.A0z(this, "value");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupCommonFragmentImpl(JSONObject jSONObject) {
        super(jSONObject);
        C18070vi.A0d(jSONObject, 1);
    }

    public Participants A0H() {
        return (Participants) C20125A8k.A02(this, Participants.class, "participants");
    }

    public Subject A0I() {
        return (Subject) A09(Subject.class, "subject");
    }
}
