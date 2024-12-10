package com.whatsapp.infra.graphql.generated.newsletter;

import X.AnonymousClass1IX;
import X.C20125A8k;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifySource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterWamoSubStatus;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;
import org.json.JSONObject;

public final class NewsletterMetadataFieldsImpl extends C20125A8k implements NewsletterMetadataFields {

    public final class State extends C20125A8k implements NewsletterMetadataFields.State {
        public GraphQLXWA2NewsletterStateType Baq() {
            return (GraphQLXWA2NewsletterStateType) A0D(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        public State(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public final class ThreadMetadata extends C20125A8k implements NewsletterMetadataFields.ThreadMetadata {

        public final class Description extends C20125A8k implements NewsletterMetadataFields.ThreadMetadata.Description {
            public String BaG() {
                return A0F("text");
            }

            public String getId() {
                return this.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Description(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Name extends C20125A8k implements NewsletterMetadataFields.ThreadMetadata.Name {
            public String BaG() {
                return A0F("text");
            }

            public String getId() {
                return this.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public Name(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class Picture extends C20125A8k implements NewsletterMetadataFields.ThreadMetadata.Picture {
            public String BQg() {
                return A0F("direct_path");
            }

            public void Bat() {
                A0D(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }

            public void Bb6() {
                A0F("url");
            }

            public Picture(JSONObject jSONObject) {
                super(jSONObject);
            }

            public String getId() {
                return C20125A8k.A08(this);
            }
        }

        public final class Preview extends C20125A8k implements NewsletterMetadataFields.ThreadMetadata.Preview {
            public String BQg() {
                return A0F("direct_path");
            }

            public void Bau() {
                A0D(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }

            public void Bb7() {
                A0F("url");
            }

            public Preview(JSONObject jSONObject) {
                super(jSONObject);
            }

            public String getId() {
                return C20125A8k.A08(this);
            }
        }

        public final class Settings extends C20125A8k implements NewsletterMetadataFields.ThreadMetadata.Settings {

            public final class ReactionCodes extends C20125A8k implements NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes {
                public AnonymousClass1IX BNT() {
                    return A0C("blocked_codes");
                }

                public String BRE() {
                    return A0F("enabled_ts_sec");
                }

                public GraphQLXWA2NewsletterReactionCodesSettingValue BbA() {
                    return (GraphQLXWA2NewsletterReactionCodesSettingValue) A0D(GraphQLXWA2NewsletterReactionCodesSettingValue.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "value");
                }

                public ReactionCodes(JSONObject jSONObject) {
                    super(jSONObject);
                }
            }

            public NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes BXs() {
                return (NewsletterMetadataFields.ThreadMetadata.Settings.ReactionCodes) A09(ReactionCodes.class, "reaction_codes");
            }

            public Settings(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public final class WamoSub extends C20125A8k {
            public WamoSub(JSONObject jSONObject) {
                super(jSONObject);
            }
        }

        public String BPf() {
            return A0F("creation_time");
        }

        public NewsletterMetadataFields.ThreadMetadata.Description BQW() {
            return (NewsletterMetadataFields.ThreadMetadata.Description) A09(Description.class, "description");
        }

        public String BRt() {
            return A0F("followers_count");
        }

        public String BSE() {
            return A0F("handle");
        }

        public String BTE() {
            return A0F("invite");
        }

        public NewsletterMetadataFields.ThreadMetadata.Name BVC() {
            return (NewsletterMetadataFields.ThreadMetadata.Name) A09(Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }

        public NewsletterMetadataFields.ThreadMetadata.Picture BX7() {
            return (NewsletterMetadataFields.ThreadMetadata.Picture) A09(Picture.class, "picture");
        }

        public NewsletterMetadataFields.ThreadMetadata.Preview BXR() {
            return (NewsletterMetadataFields.ThreadMetadata.Preview) A09(Preview.class, "preview");
        }

        public NewsletterMetadataFields.ThreadMetadata.Settings BZ6() {
            return (NewsletterMetadataFields.ThreadMetadata.Settings) A09(Settings.class, "settings");
        }

        public String BZp() {
            return A0F("subscribers_count");
        }

        public GraphQLXWA2NewsletterVerifyState BbN() {
            return (GraphQLXWA2NewsletterVerifyState) A0D(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification");
        }

        public GraphQLXWA2NewsletterVerifySource BbO() {
            return (GraphQLXWA2NewsletterVerifySource) A0D(GraphQLXWA2NewsletterVerifySource.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification_source");
        }

        public WamoSub Bbk() {
            return (WamoSub) A09(WamoSub.class, "wamo_sub");
        }

        public ThreadMetadata(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public final class ViewerMetadata extends C20125A8k implements NewsletterMetadataFields.ViewerMetadata {
        public GraphQLXWA2NewsletterMuteSetting BV8() {
            return (GraphQLXWA2NewsletterMuteSetting) A0D(GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "mute");
        }

        public GraphQLXWA2NewsletterRole BYO() {
            return (GraphQLXWA2NewsletterRole) A0D(GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "role");
        }

        public GraphQLXWA2NewsletterWamoSubStatus Bbl() {
            return (GraphQLXWA2NewsletterWamoSubStatus) A0D(GraphQLXWA2NewsletterWamoSubStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "wamo_sub_status");
        }

        public ViewerMetadata(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public NewsletterMetadataFields.State BZb() {
        return (NewsletterMetadataFields.State) A09(State.class, "state");
    }

    public NewsletterMetadataFields.ThreadMetadata BaL() {
        return (NewsletterMetadataFields.ThreadMetadata) A09(ThreadMetadata.class, "thread_metadata");
    }

    public NewsletterMetadataFields.ViewerMetadata Bbe() {
        return (NewsletterMetadataFields.ViewerMetadata) A09(ViewerMetadata.class, "viewer_metadata");
    }

    public NewsletterMetadataFieldsImpl(JSONObject jSONObject) {
        super(jSONObject);
    }
}
