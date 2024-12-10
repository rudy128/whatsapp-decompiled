package com.whatsapp.infra.graphql.generated.newsletter;

import X.AnonymousClass1IX;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterWamoSubStatus;

public interface NewsletterMetadataFields {

    public interface State {
        GraphQLXWA2NewsletterStateType Baq();
    }

    public interface ThreadMetadata {

        public interface Description {
            String BaG();

            String getId();
        }

        public interface Name {
            String BaG();

            String getId();
        }

        public interface Picture {
            String BQg();

            void Bat();

            void Bb6();

            String getId();
        }

        public interface Preview {
            String BQg();

            void Bau();

            void Bb7();

            String getId();
        }

        public interface Settings {

            public interface ReactionCodes {
                AnonymousClass1IX BNT();

                String BRE();

                GraphQLXWA2NewsletterReactionCodesSettingValue BbA();
            }

            ReactionCodes BXs();
        }

        String BPf();

        Description BQW();

        String BRt();

        String BSE();

        String BTE();

        Name BVC();

        Picture BX7();

        Preview BXR();

        Settings BZ6();

        String BZp();

        GraphQLXWA2NewsletterVerifyState BbN();

        GraphQLXWA2NewsletterVerifySource BbO();

        NewsletterMetadataFieldsImpl.ThreadMetadata.WamoSub Bbk();
    }

    public interface ViewerMetadata {
        GraphQLXWA2NewsletterMuteSetting BV8();

        GraphQLXWA2NewsletterRole BYO();

        GraphQLXWA2NewsletterWamoSubStatus Bbl();
    }

    State BZb();

    ThreadMetadata BaL();

    ViewerMetadata Bbe();
}
