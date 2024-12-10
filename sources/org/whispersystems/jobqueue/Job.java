package org.whispersystems.jobqueue;

import X.AnonymousClass000;
import X.AnonymousClass1PY;
import X.AnonymousClass8BT;
import X.AnonymousClass9LO;
import X.B8R;
import X.BB0;
import X.BCA;
import X.C122936Sm;
import X.C175048xu;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C22515BAy;
import X.C22516BAz;
import X.C29621ca;
import X.C60482o6;
import android.os.PowerManager;
import com.whatsapp.community.sync.CommunityGetParentGroupInfoSyncJob;
import com.whatsapp.community.sync.CommunityOneTimeSyncJob;
import com.whatsapp.community.sync.CommunitySubGroupsSyncJob;
import com.whatsapp.group.batch.FetchTruncatedGroupsJob;
import com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob;
import com.whatsapp.jobqueue.job.ReceiptProcessingJob;
import com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob;
import com.whatsapp.jobqueue.job.SendEngagedReceiptJob;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import com.whatsapp.newsletter.iq.GetNewsletterMessagesJob;
import com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob;
import com.whatsapp.newsletter.iq.GetNewsletterMyAddOnMessagesJob;
import com.whatsapp.newsletter.mex.BaseMetadataNewsletterGraphqlJob;
import com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob;
import com.whatsapp.newsletter.mex.DeleteNewsletterGraphqlJob;
import com.whatsapp.newsletter.mex.GetDirectoryNewslettersGraphqlJob;
import com.whatsapp.newsletter.mex.NewsletterDirectoryCategoriesPreviewGQLJob;
import com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob;
import com.whatsapp.newsletter.mex.NoOpDirectoryJob;
import com.whatsapp.newsletter.mex.UpdateNewsletterGraphqlJob;
import com.whatsapp.util.Log;
import java.io.Serializable;
import org.whispersystems.jobqueue.requirements.Requirement;

public abstract class Job implements Serializable {
    public transient int A00;
    public transient long A01;
    public transient PowerManager.WakeLock A02;
    public final JobParameters parameters;

    public void A08() {
        String str;
        Throwable th;
        String str2;
        C22515BAy bAy;
        C22515BAy bAy2;
        if (this instanceof UpdateNewsletterGraphqlJob) {
            UpdateNewsletterGraphqlJob updateNewsletterGraphqlJob = (UpdateNewsletterGraphqlJob) this;
            Log.i("UpdateNewsletterGraphqlJob/onAdded");
            AnonymousClass1PY r0 = updateNewsletterGraphqlJob.A03;
            if (r0 == null) {
                str = "mexGraphqlClient";
            } else if (!r0.A02() && (bAy2 = updateNewsletterGraphqlJob.callback) != null) {
                bAy2.onError(new C175048xu());
                return;
            } else {
                return;
            }
        } else {
            if (this instanceof NewsletterFollowersGraphqlJob) {
                NewsletterFollowersGraphqlJob newsletterFollowersGraphqlJob = (NewsletterFollowersGraphqlJob) this;
                Log.i("NewsletterFollowersGraphqlJob/onAdded");
                AnonymousClass1PY r02 = newsletterFollowersGraphqlJob.A02;
                if (r02 != null) {
                    if (!r02.A02() && newsletterFollowersGraphqlJob.callback != null) {
                        new C175048xu();
                        return;
                    }
                    return;
                }
            } else {
                if (this instanceof NewsletterDirectoryCategoriesPreviewGQLJob) {
                    NewsletterDirectoryCategoriesPreviewGQLJob newsletterDirectoryCategoriesPreviewGQLJob = (NewsletterDirectoryCategoriesPreviewGQLJob) this;
                    AnonymousClass1PY r03 = newsletterDirectoryCategoriesPreviewGQLJob.A00;
                    th = null;
                    if (r03 != null) {
                        if (!r03.A02()) {
                            BB0 bb0 = newsletterDirectoryCategoriesPreviewGQLJob.callback;
                            if (bb0 != null) {
                                bb0.Bsq(new C175048xu());
                            }
                            newsletterDirectoryCategoriesPreviewGQLJob.callback = null;
                            return;
                        }
                        return;
                    }
                } else if (this instanceof GetDirectoryNewslettersGraphqlJob) {
                    GetDirectoryNewslettersGraphqlJob getDirectoryNewslettersGraphqlJob = (GetDirectoryNewslettersGraphqlJob) this;
                    Log.i("GetDirectoryNewslettersJob/onAdded");
                    AnonymousClass1PY r04 = getDirectoryNewslettersGraphqlJob.A00;
                    th = null;
                    if (r04 != null) {
                        if (!r04.A02()) {
                            C22516BAz bAz = getDirectoryNewslettersGraphqlJob.callback;
                            if (bAz != null) {
                                bAz.Bsq(new C175048xu());
                            }
                            getDirectoryNewslettersGraphqlJob.callback = null;
                            return;
                        }
                        return;
                    }
                } else if (this instanceof DeleteNewsletterGraphqlJob) {
                    DeleteNewsletterGraphqlJob deleteNewsletterGraphqlJob = (DeleteNewsletterGraphqlJob) this;
                    Log.i("DeleteNewsletterGraphqlJob/onAdded");
                    AnonymousClass1PY r05 = deleteNewsletterGraphqlJob.A00;
                    if (r05 != null) {
                        if (!r05.A02() && (bAy = deleteNewsletterGraphqlJob.callback) != null) {
                            bAy.onError(new C175048xu());
                            return;
                        }
                        return;
                    }
                } else if (this instanceof BaseNewsletterDirectoryV2GraphqlJob) {
                    BaseNewsletterDirectoryV2GraphqlJob baseNewsletterDirectoryV2GraphqlJob = (BaseNewsletterDirectoryV2GraphqlJob) this;
                    if (!(baseNewsletterDirectoryV2GraphqlJob instanceof NoOpDirectoryJob)) {
                        AnonymousClass1PY r06 = baseNewsletterDirectoryV2GraphqlJob.A02;
                        if (r06 == null) {
                            str = "graphQlClient";
                        } else if (!r06.A02()) {
                            BCA bca = baseNewsletterDirectoryV2GraphqlJob.callback;
                            if (bca != null) {
                                bca.Bsq(new C175048xu());
                            }
                            baseNewsletterDirectoryV2GraphqlJob.callback = null;
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (this instanceof BaseMetadataNewsletterGraphqlJob) {
                        str2 = "BaseMetadataNewsletterGraphqlJob/onAdded";
                    } else if (this instanceof GetNewsletterMyAddOnMessagesJob) {
                        str2 = "GetNewsletterMyAddOnsMessagesJob/onAdded";
                    } else if (this instanceof GetNewsletterMessagesUpdatesJob) {
                        str2 = "GetNewsletterMessagesUpdatesJob/onAdded";
                    } else if (this instanceof GetNewsletterMessagesJob) {
                        str2 = "GetNewsletterMessagesJob/onAdded";
                    } else if (!(this instanceof SendEngagedReceiptJob) && !(this instanceof SendDeleteHistorySyncMmsJob)) {
                        if (this instanceof ReceiptProcessingJob) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("ReceiptProcessingJob/onAdded ");
                            C17890vO.A1A(A10, ReceiptProcessingJob.A00((ReceiptProcessingJob) this));
                            return;
                        } else if (this instanceof ReceiptMultiTargetProcessingJob) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("ReceiptMultiTargetProcessingJob/onAdded ");
                            C17890vO.A1A(A102, ReceiptMultiTargetProcessingJob.A00((ReceiptMultiTargetProcessingJob) this));
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                    Log.i(str2);
                    return;
                }
                C18070vi.A11("graphQlClient");
                throw th;
            }
            str = "graphqlClient";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A09() {
        String str;
        if (this instanceof UpdateNewsletterGraphqlJob) {
            if (!((BaseNewslettersJob) this).isCancelled) {
                Log.i("UpdateNewsletterGraphqlJob/onCanceled");
            }
        } else if (this instanceof NewsletterFollowersGraphqlJob) {
            Log.i("NewsletterFollowersGraphqlJob/onCanceled");
            ((NewsletterFollowersGraphqlJob) this).callback = null;
        } else if (this instanceof NewsletterDirectoryCategoriesPreviewGQLJob) {
            NewsletterDirectoryCategoriesPreviewGQLJob newsletterDirectoryCategoriesPreviewGQLJob = (NewsletterDirectoryCategoriesPreviewGQLJob) this;
            if (!newsletterDirectoryCategoriesPreviewGQLJob.isCancelled) {
                newsletterDirectoryCategoriesPreviewGQLJob.callback = null;
            }
        } else if (this instanceof GetDirectoryNewslettersGraphqlJob) {
            if (!((BaseNewslettersJob) this).isCancelled) {
                Log.i("GetDirectoryNewslettersJob/onCanceled");
            }
        } else if (this instanceof DeleteNewsletterGraphqlJob) {
            ((DeleteNewsletterGraphqlJob) this).callback = null;
            Log.i("DeleteNewsletterGraphqlJob/onCanceled");
        } else if (this instanceof BaseNewsletterDirectoryV2GraphqlJob) {
            BaseNewsletterDirectoryV2GraphqlJob baseNewsletterDirectoryV2GraphqlJob = (BaseNewsletterDirectoryV2GraphqlJob) this;
            if (!baseNewsletterDirectoryV2GraphqlJob.isCancelled) {
                baseNewsletterDirectoryV2GraphqlJob.callback = null;
            }
        } else if (this instanceof BaseMetadataNewsletterGraphqlJob) {
            BaseMetadataNewsletterGraphqlJob baseMetadataNewsletterGraphqlJob = (BaseMetadataNewsletterGraphqlJob) this;
            if (!baseMetadataNewsletterGraphqlJob.isCancelled) {
                baseMetadataNewsletterGraphqlJob.callback = null;
                Log.i("BaseMetadataNewsletterGraphqlJob/onCanceled");
            }
        } else if (this instanceof GetNewsletterMyAddOnMessagesJob) {
            Log.i("GetNewsletterMyAddOnsMessagesJob/onCanceled");
        } else if (this instanceof GetNewsletterMessagesUpdatesJob) {
            Log.i("GetNewsletterMessagesUpdatesJob/onCanceled");
        } else if (this instanceof GetNewsletterMessagesJob) {
            GetNewsletterMessagesJob getNewsletterMessagesJob = (GetNewsletterMessagesJob) this;
            Log.i("GetNewsletterMessagesJob/onCanceled");
            B8R b8r = getNewsletterMessagesJob.callback;
            if (b8r != null) {
                b8r.CFT(getNewsletterMessagesJob.token);
            }
        } else if (this instanceof SendEngagedReceiptJob) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("canceled sent engaged receipts job: ");
            C17890vO.A1B(A10, SendEngagedReceiptJob.A00((SendEngagedReceiptJob) this));
        } else if (this instanceof SendDeleteHistorySyncMmsJob) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("SendDeleteHistorySyncMmsJob/ cancelled chunkId=");
            C17890vO.A1B(A102, ((SendDeleteHistorySyncMmsJob) this).chunkId);
        } else if (this instanceof ReceiptProcessingJob) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("ReceiptProcessingJob/onCanceled/cancel job param=");
            C17890vO.A1B(A103, ReceiptProcessingJob.A00((ReceiptProcessingJob) this));
        } else if (this instanceof ReceiptMultiTargetProcessingJob) {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("ReceiptMultiTargetProcessingJob/onCanceled/cancel job param=");
            C17890vO.A1B(A104, ReceiptMultiTargetProcessingJob.A00((ReceiptMultiTargetProcessingJob) this));
        } else if (this instanceof GetStatusPrivacyJob) {
            StringBuilder A105 = AnonymousClass000.A10();
            A105.append("canceled get status privacy job");
            StringBuilder A106 = AnonymousClass000.A10();
            C17900vP.A0q(A106, (GetStatusPrivacyJob) this);
            C17890vO.A1B(A105, A106.toString());
        } else if (this instanceof DeleteAccountFromHsmServerJob) {
            StringBuilder A107 = AnonymousClass000.A10();
            StringBuilder A0y = AnonymousClass8BT.A0y("DeleteAccountFromHsmServerJob/canceled delete account from hsm server job", A107);
            C17900vP.A0q(A0y, this);
            C17890vO.A1B(A107, A0y.toString());
        } else if (this instanceof FetchTruncatedGroupsJob) {
            Log.w("GroupInfoBatchProcessor/FetchTruncatedGroupJob canceled");
        } else {
            CommunityOneTimeSyncJob communityOneTimeSyncJob = (CommunityOneTimeSyncJob) this;
            StringBuilder A108 = AnonymousClass000.A10();
            if (communityOneTimeSyncJob instanceof CommunitySubGroupsSyncJob) {
                str = "CommunitySubgroupsSyncJob";
            } else if (communityOneTimeSyncJob instanceof CommunityGetParentGroupInfoSyncJob) {
                str = "CommunityGetParentGroupInfoSyncJob";
            } else {
                str = "MemberSuggestedGroupsSyncJob";
            }
            A108.append(str);
            A108.append("/canceled; ");
            C17890vO.A1B(A108, communityOneTimeSyncJob.A0D());
        }
    }

    /* JADX WARNING: type inference failed for: r2v25, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v19, types: [com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput, com.facebook.graphql.calls.GraphQlCallInput] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0a6d  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a81  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0a85  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0a9c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r24 = this;
            r0 = r24
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.UpdateNewsletterGraphqlJob
            if (r1 == 0) goto L_0x00fd
            com.whatsapp.newsletter.mex.UpdateNewsletterGraphqlJob r0 = (com.whatsapp.newsletter.mex.UpdateNewsletterGraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            java.lang.String r1 = "UpdateNewsletterGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.9ju r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r7 = 0
            r5 = r7
            boolean r1 = r0.updateDescription
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x002c
            java.lang.String r2 = r0.description
            if (r2 == 0) goto L_0x0025
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            java.lang.String r1 = "description"
            X.8Kx r5 = X.C162478Kx.A00(r6, r2, r1)
        L_0x002c:
            boolean r1 = r0.updateName
            if (r1 == 0) goto L_0x0046
            java.lang.String r2 = r0.name
            if (r2 == 0) goto L_0x003a
            int r1 = r2.length()
            if (r1 != 0) goto L_0x003b
        L_0x003a:
            r2 = r7
        L_0x003b:
            java.lang.String r1 = "name"
            if (r5 != 0) goto L_0x0043
            X.8Kx r5 = r6.A00()
        L_0x0043:
            X.C162478Kx.A01(r5, r2, r1)
        L_0x0046:
            boolean r1 = r0.updatePicture
            if (r1 == 0) goto L_0x0061
            byte[] r2 = r0.picture
            if (r2 == 0) goto L_0x0073
            int r1 = r2.length
            if (r1 == 0) goto L_0x0073
            r1 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r1)
            java.lang.String r1 = "picture"
            if (r5 != 0) goto L_0x005e
            X.8Kx r5 = r6.A00()
        L_0x005e:
            X.C162478Kx.A01(r5, r2, r1)
        L_0x0061:
            boolean r1 = r0.updateReactionSetting
            if (r1 == 0) goto L_0x00ab
            X.9Ih r2 = r0.newsletterReactionSettings
            if (r2 == 0) goto L_0x00ab
            X.A8r r1 = r0.A05
            if (r1 != 0) goto L_0x007f
            java.lang.String r0 = "newsletterGraphqlUtil"
            X.C18070vi.A11(r0)
            throw r7
        L_0x0073:
            java.lang.String r1 = "picture"
            if (r5 != 0) goto L_0x007b
            X.8Kx r5 = r6.A00()
        L_0x007b:
            X.C162478Kx.A01(r5, r3, r1)
            goto L_0x0061
        L_0x007f:
            int r2 = r2.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x00ea
            r1 = 0
            if (r2 == r1) goto L_0x00e7
            r1 = 2
            if (r2 == r1) goto L_0x00e4
            r1 = 3
            if (r2 != r1) goto L_0x00f8
            java.lang.String r2 = "BLOCKLIST"
        L_0x0091:
            java.lang.String r1 = "value"
            X.8Kx r3 = X.C162478Kx.A00(r6, r2, r1)
            java.lang.String r1 = "reaction_codes"
            X.8Kx r2 = r6.A00()
            r2.A06(r3, r1)
            java.lang.String r1 = "settings"
            if (r5 != 0) goto L_0x00a8
            X.8Kx r5 = r6.A00()
        L_0x00a8:
            r5.A06(r2, r1)
        L_0x00ab:
            X.A7K r4 = X.A7K.A00()
            X.1ch r1 = r0.newsletterJid
            boolean r3 = X.A7K.A03(r4, r1)
            java.lang.String r2 = "updates"
            X.29S r1 = r4.A00
            X.8Kx r1 = r1.A02()
            if (r5 != 0) goto L_0x00c3
            X.8Kx r5 = r6.A00()
        L_0x00c3:
            r1.A06(r5, r2)
            java.lang.Boolean r2 = X.AnonymousClass000.A0i()
            java.lang.String r1 = "fetch_state"
            r4.A06(r1, r2)
            X.C199610h.A07(r3)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataUpdateResponseImpl.class
            java.lang.String r1 = "NewsletterMetadataUpdate"
            X.AIj r2 = X.AIj.A00(r4, r2, r1)
            X.1PY r1 = r0.A03
            if (r1 != 0) goto L_0x00ed
            java.lang.String r0 = "mexGraphqlClient"
            X.C18070vi.A11(r0)
            throw r7
        L_0x00e4:
            java.lang.String r2 = "NONE"
            goto L_0x0091
        L_0x00e7:
            java.lang.String r2 = "BASIC"
            goto L_0x0091
        L_0x00ea:
            java.lang.String r2 = "ALL"
            goto L_0x0091
        L_0x00ed:
            X.A2g r2 = r1.A01(r2)
            X.Azf r1 = new X.Azf
            r1.<init>(r0)
            goto L_0x0a0f
        L_0x00f8:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00fd:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob
            if (r1 == 0) goto L_0x0149
            com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob r0 = (com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            java.lang.String r1 = "NewsletterFollowersGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.9ju r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r5 = 0
            X.1ch r1 = r0.newsletterJid
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "newsletter_id"
            X.8Kx r4 = X.C162478Kx.A00(r3, r2, r1)
            X.9IV r3 = r0.typeOfFetch
            X.9IV r2 = X.AnonymousClass9IV.SHORT
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r3 != r2) goto L_0x0125
            r1 = 10
        L_0x0125:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "count"
            X.C162478Kx.A01(r4, r2, r1)
            X.A7K r3 = X.A7K.A00()
            java.lang.String r1 = "input"
            X.C108975cc.A0z(r4, r3, r1)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSubscribersResponseImpl.class
            java.lang.String r1 = "NewsletterSubscribers"
            X.AIj r2 = X.AIj.A00(r3, r2, r1)
            X.1PY r1 = r0.A02
            if (r1 != 0) goto L_0x0a06
            java.lang.String r0 = "graphqlClient"
            X.C18070vi.A11(r0)
            throw r5
        L_0x0149:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.NoOpDirectoryJob
            if (r1 == 0) goto L_0x0163
            com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob r0 = (com.whatsapp.newsletter.mex.BaseNewsletterDirectoryV2GraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            X.BCA r3 = r0.callback
            if (r3 == 0) goto L_0x0afa
            java.lang.String r2 = ""
            r1 = 0
            X.8xw r0 = new X.8xw
            r0.<init>(r2, r1)
            r3.Bsq(r0)
            return
        L_0x0163:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.NewsletterDirectoryV2SearchGraphqlJob
            if (r1 == 0) goto L_0x01be
            com.whatsapp.newsletter.mex.NewsletterDirectoryV2SearchGraphqlJob r0 = (com.whatsapp.newsletter.mex.NewsletterDirectoryV2SearchGraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            X.1PY r4 = r0.A02
            if (r4 == 0) goto L_0x0329
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectorySearchInput r5 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectorySearchInput
            r5.<init>()
            java.lang.String r2 = r0.query
            java.lang.String r1 = "search_text"
            r5.A05(r1, r2)
            int r1 = r0.limit
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "limit"
            X.8Kx r1 = r5.A02()
            X.C162478Kx.A01(r1, r3, r2)
            java.lang.String r2 = r0.startCursor
            java.lang.String r1 = "start_cursor"
            r5.A05(r1, r2)
            X.9Ir r1 = r0.directoryCategory
            if (r1 == 0) goto L_0x01bc
            java.lang.String[] r3 = X.C17880vN.A1Y()
            r2 = 0
            java.lang.String r1 = r1.name()
            java.util.ArrayList r2 = X.AnonymousClass8BR.A11(r1, r3, r2)
        L_0x01a4:
            java.lang.String r1 = "categories"
            r5.A06(r1, r2)
            X.A7K r3 = X.A7K.A01(r5)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectorySearchResponseImpl.class
            java.lang.String r1 = "NewsletterDirectorySearch"
            X.A2g r2 = X.AIj.A01(r3, r4, r2, r1)
            X.Azd r1 = new X.Azd
            r1.<init>(r0)
            goto L_0x0a0f
        L_0x01bc:
            r2 = 0
            goto L_0x01a4
        L_0x01be:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.NewsletterDirectoryV2ListGraphqlJob
            if (r1 == 0) goto L_0x0298
            com.whatsapp.newsletter.mex.NewsletterDirectoryV2ListGraphqlJob r0 = (com.whatsapp.newsletter.mex.NewsletterDirectoryV2ListGraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            X.9Ir r1 = r0.directoryCategory
            if (r1 == 0) goto L_0x0201
            java.lang.String r2 = r1.name()
        L_0x01d0:
            java.lang.String r1 = r0.startCursor
            if (r1 != 0) goto L_0x0229
            X.9xq r5 = r0.cache
            if (r5 == 0) goto L_0x0229
            X.6RR r1 = r0.type
            java.lang.String r4 = r1.value
            java.lang.String r3 = r0.countryCode
            r1 = 0
            X.C18070vi.A0d(r4, r1)
            X.C198139xq.A00(r5)
            if (r3 != 0) goto L_0x01e9
            java.lang.String r3 = "global"
        L_0x01e9:
            if (r2 != 0) goto L_0x01ed
            java.lang.String r2 = "explore"
        L_0x01ed:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r2)
            r1 = 95
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = X.C17890vO.A0Z(r3, r2, r1)
            java.util.Map r4 = r5.A02
            monitor-enter(r4)
            goto L_0x0203
        L_0x0201:
            r2 = 0
            goto L_0x01d0
        L_0x0203:
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x0226 }
            X.9rp r1 = (X.C194499rp) r1     // Catch:{ all -> 0x0226 }
            if (r1 == 0) goto L_0x0214
            java.util.List r2 = r1.A02     // Catch:{ all -> 0x0226 }
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x0226 }
            X.1D6 r3 = X.AnonymousClass1D6.A01(r2, r1)     // Catch:{ all -> 0x0226 }
            goto L_0x0215
        L_0x0214:
            r3 = 0
        L_0x0215:
            monitor-exit(r4)
            if (r3 == 0) goto L_0x0229
            X.BCA r2 = r0.originalCallback
            java.lang.Object r1 = r3.first
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r3.second
            java.lang.String r0 = (java.lang.String) r0
            r2.CDZ(r1, r0)
            return
        L_0x0226:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0229:
            X.1PY r5 = r0.A02
            if (r5 == 0) goto L_0x0329
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryFilterInput r6 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryFilterInput
            r6.<init>()
            java.lang.String r2 = r0.countryCode
            r7 = 0
            r4 = 1
            r3 = 0
            if (r2 == 0) goto L_0x0296
            java.lang.String[] r1 = new java.lang.String[r4]
            java.util.ArrayList r2 = X.AnonymousClass8BR.A11(r2, r1, r7)
        L_0x023f:
            java.lang.String r1 = "country_codes"
            r6.A06(r1, r2)
            X.9Ir r1 = r0.directoryCategory
            if (r1 == 0) goto L_0x0252
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r1 = r1.name()
            java.util.ArrayList r3 = X.AnonymousClass8BR.A11(r1, r2, r7)
        L_0x0252:
            java.lang.String r1 = "categories"
            r6.A06(r1, r3)
            X.9ju r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            X.6RR r1 = r0.type
            java.lang.String r2 = r1.value
            java.lang.String r1 = "view"
            X.8Kx r4 = X.C162478Kx.A00(r3, r2, r1)
            int r1 = r0.limit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "limit"
            X.C162478Kx.A01(r4, r2, r1)
            java.lang.String r2 = r0.startCursor
            java.lang.String r1 = "start_cursor"
            X.C162478Kx.A01(r4, r2, r1)
            java.lang.String r2 = "filters"
            X.8Kx r1 = r6.A02()
            r4.A06(r1, r2)
            X.A7K r3 = X.A7K.A00()
            java.lang.String r1 = "input"
            X.C108975cc.A0z(r4, r3, r1)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl.class
            java.lang.String r1 = "NewsletterDirectoryList"
            X.A2g r2 = X.AIj.A01(r3, r5, r2, r1)
            X.Azc r1 = new X.Azc
            r1.<init>(r0)
            goto L_0x0a0f
        L_0x0296:
            r2 = r3
            goto L_0x023f
        L_0x0298:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.NewsletterDirectoryCategoriesPreviewGQLJob
            if (r1 == 0) goto L_0x0330
            com.whatsapp.newsletter.mex.NewsletterDirectoryCategoriesPreviewGQLJob r0 = (com.whatsapp.newsletter.mex.NewsletterDirectoryCategoriesPreviewGQLJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            X.9yC r6 = r0.cache
            if (r6 == 0) goto L_0x02f0
            java.util.List r5 = r0.categories
            java.lang.String r4 = r0.countryCode
            r1 = 0
            X.C18070vi.A0d(r5, r1)
            X.C198349yC.A00(r6)
            if (r4 != 0) goto L_0x02b5
            java.lang.String r4 = "global"
        L_0x02b5:
            X.0vb r1 = r6.A01
            java.lang.String r3 = r1.A05()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.util.List r1 = X.C29431cG.A0s(r5)
            r2.append(r1)
            r1 = 95
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = X.C17890vO.A0Z(r3, r2, r1)
            java.util.Map r3 = r6.A03
            monitor-enter(r3)
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x02ed }
            X.9qr r1 = (X.C193909qr) r1     // Catch:{ all -> 0x02ed }
            if (r1 == 0) goto L_0x02e0
            java.util.List r2 = r1.A01     // Catch:{ all -> 0x02ed }
            goto L_0x02e1
        L_0x02e0:
            r2 = 0
        L_0x02e1:
            monitor-exit(r3)
            if (r2 == 0) goto L_0x02f0
            X.BB0 r1 = r0.callback
            if (r1 == 0) goto L_0x0afa
            r0 = 0
            r1.CDY(r2, r0)
            return
        L_0x02ed:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x02f0:
            X.1PY r5 = r0.A00
            if (r5 == 0) goto L_0x0329
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryCategoryPreviewInput r4 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryCategoryPreviewInput
            r4.<init>()
            java.util.List r2 = r0.categories
            java.lang.String r1 = "categories"
            r4.A06(r1, r2)
            int r1 = r0.limit
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "per_category_limit"
            X.8Kx r1 = r4.A02()
            X.C162478Kx.A01(r1, r3, r2)
            java.lang.String r2 = r0.countryCode
            java.lang.String r1 = "country_code"
            r4.A05(r1, r2)
            X.A7K r3 = X.A7K.A01(r4)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryCategoryPreviewResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryCategoryPreviewResponseImpl.class
            java.lang.String r1 = "NewsletterDirectoryCategoryPreview"
            X.A2g r2 = X.AIj.A01(r3, r5, r2, r1)
            X.Azb r1 = new X.Azb
            r1.<init>(r0)
            goto L_0x0a0f
        L_0x0329:
            java.lang.String r0 = "graphQlClient"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0330:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.GetDirectoryNewslettersGraphqlJob
            if (r1 == 0) goto L_0x0372
            com.whatsapp.newsletter.mex.GetDirectoryNewslettersGraphqlJob r0 = (com.whatsapp.newsletter.mex.GetDirectoryNewslettersGraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            java.lang.String r1 = "GetDirectoryNewslettersJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r0.isRecommended
            java.lang.String r2 = "graphQlClient"
            X.1PY r5 = r0.A00
            if (r1 == 0) goto L_0x0354
            if (r5 == 0) goto L_0x034f
            X.6pa r1 = r0.A01
            if (r1 != 0) goto L_0x0949
            java.lang.String r2 = "newsletterDirectoryUtil"
        L_0x034f:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        L_0x0354:
            if (r5 == 0) goto L_0x034f
            X.9ju r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r3 = 0
            java.lang.String r2 = r0.sortField
            java.lang.String r1 = "field"
            X.8Kx r6 = X.C162478Kx.A00(r4, r2, r1)
            java.lang.String r2 = r0.sortOrder
            java.lang.String r1 = "order"
            X.C162478Kx.A01(r6, r2, r1)
            X.6pa r1 = r0.A01
            if (r1 != 0) goto L_0x0996
            java.lang.String r0 = "newsletterDirectoryUtil"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0372:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.DeleteNewsletterGraphqlJob
            if (r1 == 0) goto L_0x03a1
            com.whatsapp.newsletter.mex.DeleteNewsletterGraphqlJob r0 = (com.whatsapp.newsletter.mex.DeleteNewsletterGraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            java.lang.String r1 = "DeleteNewsletterGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r4 = 0
            X.A7K r3 = X.A7K.A00()
            X.1ch r1 = r0.newsletterJid
            boolean r1 = X.A7K.A03(r3, r1)
            X.C199610h.A07(r1)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterDeleteResponseImpl.class
            java.lang.String r1 = "NewsletterDelete"
            X.AIj r2 = X.AIj.A00(r3, r2, r1)
            X.1PY r1 = r0.A00
            if (r1 != 0) goto L_0x09fc
            java.lang.String r0 = "graphqlClient"
            X.C18070vi.A11(r0)
            throw r4
        L_0x03a1:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.mex.BaseMetadataNewsletterGraphqlJob
            if (r1 == 0) goto L_0x043e
            com.whatsapp.newsletter.mex.BaseMetadataNewsletterGraphqlJob r0 = (com.whatsapp.newsletter.mex.BaseMetadataNewsletterGraphqlJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            java.lang.String r1 = "BaseMetadataNewsletterGraphqlJob/onRun"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput r5 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput
            r5.<init>()
            X.1ch r1 = r0.newsletterJid
            if (r1 != 0) goto L_0x0405
            java.lang.String r2 = r0.newsletterHandle
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            java.lang.String r1 = "key"
            r5.A05(r1, r2)
            X.1i5 r1 = r0.A01
            if (r1 == 0) goto L_0x0432
            X.2Dk r1 = r1.A03(r2)
            if (r1 == 0) goto L_0x03d5
            X.9Ig r1 = r1.A02
            X.C181509Qt.A00(r1, r5)
        L_0x03d5:
            X.A8r r2 = r0.A05
            if (r2 == 0) goto L_0x0436
            X.9yl r1 = r0.metadataRequestFields
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r2 = r2.A0F(r5, r1)
        L_0x03df:
            boolean r1 = r2.A01
            X.C199610h.A07(r1)
            X.A7K r3 = r2.A00
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.class
            r4 = 0
            java.lang.String r1 = "NewsletterMetadata"
            X.AIj r3 = X.AIj.A00(r3, r2, r1)
            java.lang.String r2 = r0.handlerType
            java.lang.String r1 = "type"
            r5.A05(r1, r2)
            X.1PY r1 = r0.A02
            if (r1 == 0) goto L_0x0a13
            X.A2g r2 = r1.A01(r3)
            X.AzX r1 = new X.AzX
            r1.<init>(r0)
            goto L_0x0a0f
        L_0x0405:
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "key"
            r5.A05(r1, r2)
            X.1CJ r2 = r0.A00
            if (r2 == 0) goto L_0x043a
            X.1ch r1 = r0.newsletterJid
            X.1ci r3 = r2.A0A(r1)
            boolean r1 = r3 instanceof X.C46162Dk
            if (r1 == 0) goto L_0x0430
            X.2Dk r3 = (X.C46162Dk) r3
            if (r3 == 0) goto L_0x0425
            X.9Ig r1 = r3.A02
            X.C181509Qt.A00(r1, r5)
        L_0x0425:
            X.A8r r2 = r0.A05
            if (r2 == 0) goto L_0x0436
            X.9yl r1 = r0.metadataRequestFields
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r2 = r2.A0E(r3, r5, r1)
            goto L_0x03df
        L_0x0430:
            r3 = 0
            goto L_0x0425
        L_0x0432:
            java.lang.String r2 = "newsletterStore"
            goto L_0x034f
        L_0x0436:
            java.lang.String r2 = "newsletterGraphqlUtil"
            goto L_0x034f
        L_0x043a:
            java.lang.String r2 = "chatsCache"
            goto L_0x034f
        L_0x043e:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.iq.GetNewsletterMyAddOnMessagesJob
            if (r1 == 0) goto L_0x0488
            com.whatsapp.newsletter.iq.GetNewsletterMyAddOnMessagesJob r0 = (com.whatsapp.newsletter.iq.GetNewsletterMyAddOnMessagesJob) r0
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GetNewsletterMyAddOnsMessagesJob/onRun "
            r3.append(r1)
            X.1ch r1 = r0.newsletterJid
            r3.append(r1)
            r1 = 32
            r3.append(r1)
            long r1 = r0.count
            X.C17890vO.A16(r3, r1)
            X.1OZ r1 = r0.A02
            java.lang.String r5 = "messageClient"
            if (r1 == 0) goto L_0x0a19
            java.lang.String r6 = r1.A0B()
            long r3 = r0.count
            X.1ch r2 = r0.newsletterJid
            X.9F7 r1 = new X.9F7
            r1.<init>((X.C29681ch) r2, (java.lang.String) r6, (long) r3)
            X.1OZ r3 = r0.A02
            if (r3 == 0) goto L_0x0a19
            java.lang.Object r5 = r1.A00
            X.1ca r5 = (X.C29621ca) r5
            X.Aco r4 = new X.Aco
            r4.<init>((com.whatsapp.newsletter.iq.GetNewsletterMyAddOnMessagesJob) r0, (X.AnonymousClass9F7) r1)
            r8 = 32000(0x7d00, double:1.581E-319)
            r7 = 368(0x170, float:5.16E-43)
            r3.A0I(r4, r5, r6, r7, r8)
            return
        L_0x0488:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob
            if (r1 == 0) goto L_0x052a
            com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob r0 = (com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob) r0
            java.lang.Long r7 = r0.beforeServerId
            java.lang.String r9 = "crashLogs"
            r8 = 0
            r4 = 0
            if (r7 == 0) goto L_0x04aa
            long r5 = r7.longValue()
            r2 = 0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x04aa
            X.190 r1 = r0.A00
            if (r1 == 0) goto L_0x0a29
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/invalid params - beforeServerId"
        L_0x04a6:
            r1.A0G(r0, r4, r8)
            return
        L_0x04aa:
            long r5 = r0.count
            r2 = 1
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0522
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0522
            boolean r1 = r0.isCancelled
            if (r1 != 0) goto L_0x0afa
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GetNewsletterMessagesUpdatesJob/onRun "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ", "
            r2.append(r1)
            r2.append(r7)
            r2.append(r1)
            java.lang.Long r1 = r0.afterServerId
            X.C17900vP.A0b(r1, r2)
            X.1OZ r1 = r0.A02
            java.lang.String r5 = "messageClient"
            if (r1 == 0) goto L_0x0a25
            java.lang.String r10 = r1.A0B()
            X.1ch r7 = r0.newsletterJid
            long r11 = r0.count
            long r1 = r0.sinceMs
            long r1 = X.C17880vN.A04(r1)
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            java.lang.Long r1 = r0.beforeServerId
            if (r1 == 0) goto L_0x0518
            long r1 = r1.longValue()
            r3 = 1
        L_0x04f9:
            X.9El r8 = new X.9El
            r8.<init>(r1, r3)
            X.9F7 r6 = new X.9F7
            r6.<init>((X.C29681ch) r7, (X.C178789El) r8, (java.lang.Long) r9, (java.lang.String) r10, (long) r11)
            X.1OZ r7 = r0.A02
            if (r7 == 0) goto L_0x0a25
            java.lang.Object r9 = r6.A00
            X.1ca r9 = (X.C29621ca) r9
            X.Aco r8 = new X.Aco
            r8.<init>((com.whatsapp.newsletter.iq.GetNewsletterMessagesUpdatesJob) r0, (X.AnonymousClass9F7) r6)
            r12 = 32000(0x7d00, double:1.581E-319)
            r11 = 368(0x170, float:5.16E-43)
            r7.A0I(r8, r9, r10, r11, r12)
            return
        L_0x0518:
            java.lang.Long r1 = r0.afterServerId
            if (r1 == 0) goto L_0x0a1e
            long r1 = r1.longValue()
            r3 = 0
            goto L_0x04f9
        L_0x0522:
            X.190 r1 = r0.A00
            if (r1 == 0) goto L_0x0a29
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/invalid params - count"
            goto L_0x04a6
        L_0x052a:
            boolean r1 = r0 instanceof com.whatsapp.newsletter.iq.GetNewsletterMessagesJob
            if (r1 == 0) goto L_0x058b
            com.whatsapp.newsletter.iq.GetNewsletterMessagesJob r0 = (com.whatsapp.newsletter.iq.GetNewsletterMessagesJob) r0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GetNewsletterMessagesJob/onRun "
            r3.append(r1)
            long r1 = r0.count
            r3.append(r1)
            java.lang.String r2 = ", "
            r3.append(r2)
            java.lang.Long r1 = r0.beforeServerId
            r3.append(r1)
            r3.append(r2)
            java.lang.Long r1 = r0.afterServerId
            X.C17900vP.A0b(r1, r3)
            java.lang.Long r1 = r0.beforeServerId
            java.lang.String r2 = "crashLogs"
            r6 = 0
            r3 = 0
            if (r1 == 0) goto L_0x056c
            long r7 = r1.longValue()
            r4 = 0
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x056c
            X.190 r1 = r0.A00
            if (r1 == 0) goto L_0x0aad
            java.lang.String r0 = "GetNewsletterMessagesJob/invalid params - beforeServerId"
        L_0x0568:
            r1.A0G(r0, r3, r6)
            return
        L_0x056c:
            long r7 = r0.count
            r4 = 1
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0584
            r4 = 300(0x12c, double:1.48E-321)
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0584
            X.1CJ r2 = r0.A01
            if (r2 != 0) goto L_0x0a2d
            java.lang.String r0 = "chatsCache"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0584:
            X.190 r1 = r0.A00
            if (r1 == 0) goto L_0x0aad
            java.lang.String r0 = "GetNewsletterMessagesJob/invalid params - count"
            goto L_0x0568
        L_0x058b:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendEngagedReceiptJob
            if (r1 == 0) goto L_0x0670
            com.whatsapp.jobqueue.job.SendEngagedReceiptJob r0 = (com.whatsapp.jobqueue.job.SendEngagedReceiptJob) r0
            X.1Dv r2 = X.AnonymousClass1BI.A00
            java.lang.String r1 = r0.jidStr
            X.1BI r4 = r2.A02(r1)
            boolean r1 = X.C22971Dz.A0a(r4)
            if (r1 == 0) goto L_0x05bc
            long r5 = r0.originalMessageTimestamp
            r2 = 0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x05bc
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 + r1
            X.11P r1 = r0.A00
            if (r1 != 0) goto L_0x05b3
            java.lang.String r2 = "time"
            goto L_0x034f
        L_0x05b3:
            long r2 = X.AnonymousClass11P.A01(r1)
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x05bc
            return
        L_0x05bc:
            X.2lD r3 = new X.2lD
            r3.<init>()
            r3.A02 = r4
            java.lang.String r10 = "receipt"
            r3.A06 = r10
            java.lang.String r9 = "engaged"
            r3.A09 = r9
            java.lang.String r1 = r0.messageId
            r3.A08 = r1
            long r1 = r0.loggableStanzaId
            r3.A00 = r1
            X.2nR r3 = r3.A00()
            java.lang.String r15 = r0.messageId
            java.lang.String r7 = r0.value
            java.lang.String r6 = r0.source
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r4, r1)
            java.lang.String r2 = "to"
            r12 = 1
            X.C18070vi.A0d(r4, r12)
            X.1cX r1 = X.C108945cZ.A0t(r10)
            X.AnonymousClass8BT.A1E(r4, r1, r2)
            X.1ca r5 = r1.A03()
            java.lang.String r8 = "id"
            int r14 = X.C72453Mb.A0G(r15, r7, r12)
            r11 = 3
            X.C18070vi.A0d(r6, r11)
            r13 = 4
            r1 = 8
            java.lang.String[] r4 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r1 = "body-link"
            r4[r2] = r1
            java.lang.String r1 = "cta-app"
            r4[r12] = r1
            java.lang.String r1 = "cta-call"
            r4[r14] = r1
            java.lang.String r1 = "cta-url"
            r4[r11] = r1
            java.lang.String r1 = "media-doc"
            r4[r13] = r1
            r2 = 5
            java.lang.String r1 = "media-image"
            r4[r2] = r1
            r2 = 6
            java.lang.String r1 = "media-video"
            r4[r2] = r1
            r2 = 7
            java.lang.String r1 = "quick-reply"
            java.util.List r4 = X.C18070vi.A0O(r1, r4, r2)
            X.1cX r2 = X.C108945cZ.A0t(r10)
            java.lang.String r1 = "type"
            X.C29591cX.A01(r2, r1, r9)
            r16 = 0
            r18 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r20 = 0
            boolean r1 = X.C29601cY.A04(r15, r16, r18, r20)
            X.AnonymousClass8BW.A1F(r2, r8, r15, r1)
            java.lang.String r1 = "biz"
            X.1cX r8 = X.C108945cZ.A0t(r1)
            r10 = 1
            r9 = r7
            r12 = r18
            r14 = r20
            boolean r1 = X.C29601cY.A04(r9, r10, r12, r14)
            if (r1 == 0) goto L_0x0659
            java.lang.String r1 = "value"
            X.C29591cX.A01(r8, r1, r7)
        L_0x0659:
            java.lang.String r1 = "source"
            r8.A09(r6, r1, r4)
            X.C108955ca.A1P(r8, r2)
            r2.A06(r5)
            X.1ca r2 = r2.A03()
            X.1OZ r1 = r0.A01
            if (r1 != 0) goto L_0x0ab1
            java.lang.String r2 = "messageClient"
            goto L_0x034f
        L_0x0670:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob
            if (r1 == 0) goto L_0x06a3
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r0 = (com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob) r0
            r6 = 0
            java.lang.String r10 = "mms"
            X.1SY r5 = r0.A01
            java.lang.String r8 = r0.mediaEncHash
            X.1So r1 = X.C26551So.A05
            java.lang.String r9 = "md-msg-hist"
            if (r8 == 0) goto L_0x0ab7
            r12 = 0
            r11 = r6
            r14 = r12
            r15 = r12
            r16 = r12
            X.99o r4 = new X.99o
            r7 = r6
            r13 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1Kg r7 = r0.A02
            r10 = r6
            r8 = r9
            r9 = r6
            r11 = r12
            X.9kM r2 = X.C24421Kg.A00(r7, r8, r9, r10, r11, r12)
            X.AVU r1 = new X.AVU
            r1.<init>(r0, r4, r12)
            r2.A00(r1)
            return
        L_0x06a3:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.ReceiptProcessingJob
            if (r1 == 0) goto L_0x06e0
            com.whatsapp.jobqueue.job.ReceiptProcessingJob r0 = (com.whatsapp.jobqueue.job.ReceiptProcessingJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "ReceiptProcessingJob/onRun/start param="
            r2.append(r1)
            java.lang.String r1 = com.whatsapp.jobqueue.job.ReceiptProcessingJob.A00(r0)
            X.C17890vO.A1A(r2, r1)
            java.lang.String[] r1 = r0.keyId
            int r7 = r1.length
            java.util.ArrayList r4 = X.C17880vN.A0z(r7)
            r5 = 0
            r6 = 0
        L_0x06c2:
            if (r6 >= r7) goto L_0x0abe
            java.lang.String[] r1 = r0.keyRemoteChatJidRawString
            r1 = r1[r6]
            X.1BI r3 = X.AnonymousClass3MX.A0l(r1)
            if (r3 == 0) goto L_0x06dd
            boolean[] r1 = r0.keyFromMe
            boolean r2 = r1[r6]
            java.lang.String[] r1 = r0.keyId
            r1 = r1[r6]
            X.205 r1 = X.AnonymousClass205.A01(r3, r1, r2)
            r4.add(r1)
        L_0x06dd:
            int r6 = r6 + 1
            goto L_0x06c2
        L_0x06e0:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob
            if (r1 == 0) goto L_0x0730
            com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob r0 = (com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob) r0
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "ReceiptMultiTargetProcessingJob/onRun/start param="
            r2.append(r1)
            java.lang.String r1 = com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob.A00(r0)
            X.C17890vO.A1A(r2, r1)
            java.lang.String r2 = r0.keyRemoteChatJidRawString
            X.1Dv r1 = X.AnonymousClass1BI.A00
            X.1BI r3 = X.C22931Dv.A01(r2)
            boolean r2 = r0.keyFromMe
            java.lang.String r1 = r0.keyId
            X.205 r7 = X.AnonymousClass205.A01(r3, r1, r2)
            java.lang.String r1 = r0.remoteJidString
            com.whatsapp.jid.Jid r6 = X.C22911Dt.A00(r1)
            java.lang.String[] r1 = r0.participantDeviceJidRawString
            int r5 = r1.length
            java.util.ArrayList r10 = X.C17880vN.A0z(r5)
            r4 = 0
        L_0x0714:
            if (r4 >= r5) goto L_0x0ae5
            java.lang.String[] r1 = r0.participantDeviceJidRawString
            r2 = r1[r4]
            X.1E0 r1 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r3 = r1.A06(r2)
            if (r3 == 0) goto L_0x072d
            long[] r1 = r0.timestamp
            r1 = r1[r4]
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            X.C108965cb.A1Q(r3, r1, r10)
        L_0x072d:
            int r4 = r4 + 1
            goto L_0x0714
        L_0x0730:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.GetStatusPrivacyJob
            if (r1 == 0) goto L_0x0807
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = (com.whatsapp.jobqueue.job.GetStatusPrivacyJob) r0
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            X.9dw r6 = r0.A01
            if (r6 == 0) goto L_0x07d6
            X.9bA r4 = new X.9bA
            r4.<init>(r0, r5)
            X.5qs r2 = new X.5qs
            r2.<init>()
            X.00H r10 = r6.A02
            java.lang.String r14 = X.C17890vO.A0T(r10)
            X.0ve r11 = r6.A00
            r3 = 3845(0xf05, float:5.388E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r11, r3)
            if (r1 == 0) goto L_0x076e
            X.19Y r9 = r6.A01
            int r8 = r14.hashCode()
            r7 = 154475307(0x9351b2b, float:2.1799857E-33)
            r9.markerStart(r7, r8)
            java.lang.String r3 = "iq_type"
            r1 = 121(0x79, float:1.7E-43)
            r9.markerAnnotate((int) r7, (int) r8, (java.lang.String) r3, (int) r1)
        L_0x076e:
            X.0vf r3 = X.C18040vf.A01
            r1 = 3843(0xf03, float:5.385E-42)
            boolean r9 = X.C18020vd.A05(r3, r11, r1)
            X.1OZ r10 = X.C17880vN.A0U(r10)
            r1 = 4
            X.1MD[] r8 = new X.AnonymousClass1MD[r1]
            java.lang.String r1 = "id"
            X.AnonymousClass8BV.A1M(r1, r14, r8)
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "status"
            X.AnonymousClass8BV.A1N(r3, r1, r8)
            java.lang.String r3 = "type"
            java.lang.String r1 = "get"
            X.C17890vO.A12(r3, r1, r8)
            X.8v4 r7 = X.C173438v4.A00
            java.lang.String r1 = "to"
            X.1MD r3 = new X.1MD
            r3.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r1)
            r1 = 3
            r8[r1] = r3
            java.lang.String r3 = "privacy"
            r1 = 0
            X.1ca r1 = X.AnonymousClass8BR.A0k(r3, r1)
            X.1ca r12 = X.AnonymousClass8BT.A0a(r1, r8)
            r1 = 17
            X.Acl r11 = new X.Acl
            r11.<init>(r4, r2, r6, r1)
            r3 = 32000(0x7d00, double:1.581E-319)
            if (r9 == 0) goto L_0x07fc
            r15 = 121(0x79, float:1.7E-43)
            X.0vl r1 = r10.A0A
            java.lang.Object r1 = r1.getValue()
            java.util.Random r1 = (java.util.Random) r1
            r18 = 3
            r20 = 3600000(0x36ee80, double:1.7786363E-317)
            r22 = 1000(0x3e8, double:4.94E-321)
            X.1NV r13 = new X.1NV
            r16 = r13
            r17 = r1
            r16.<init>(r17, r18, r20, r22)
            r16 = r3
            r10.A0H(r11, r12, r13, r14, r15, r16)
        L_0x07d1:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.get(r3, r1)
        L_0x07d6:
            int r2 = r5.get()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 != r1) goto L_0x0afa
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "server 500 error during get status privacy job"
            r2.append(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C17900vP.A0q(r1, r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x07fc:
            r13 = 121(0x79, float:1.7E-43)
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r14 = r3
            r9.A0N(r10, r11, r12, r13, r14)
            goto L_0x07d1
        L_0x0807:
            boolean r1 = r0 instanceof com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob
            if (r1 == 0) goto L_0x085d
            com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob r0 = (com.whatsapp.jobqueue.job.DeleteAccountFromHsmServerJob) r0
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            X.10I r4 = r0.A01
            X.1NU r3 = r0.A00
            java.util.Random r7 = r0.A02
            r1 = 1
            X.C18070vi.A0d(r7, r1)
            r8 = 20
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            r12 = 1000(0x3e8, double:4.94E-321)
            X.1NV r6 = new X.1NV
            r6.<init>(r7, r8, r10, r12)
            X.AMR r2 = new X.AMR
            r2.<init>(r0, r5)
            X.8g2 r1 = new X.8g2
            r1.<init>(r2, r3, r6, r4)
            r1.A00()
            int r1 = r5.get()
            if (r1 == 0) goto L_0x0afa
            int r2 = r5.get()
            r1 = 404(0x194, float:5.66E-43)
            if (r2 == r1) goto L_0x0afa
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "retriable error during delete account from hsm server job"
            java.lang.StringBuilder r1 = X.AnonymousClass8BT.A0y(r1, r2)
            X.C17900vP.A0q(r1, r0)
            X.AnonymousClass8BS.A1D(r1, r2)
            java.lang.String r1 = r2.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x085d:
            boolean r1 = r0 instanceof com.whatsapp.community.sync.CommunitySubGroupsSyncJob
            if (r1 == 0) goto L_0x0892
            com.whatsapp.community.sync.CommunitySubGroupsSyncJob r0 = (com.whatsapp.community.sync.CommunitySubGroupsSyncJob) r0
            r0.A0D()
            X.1yz r2 = X.AnonymousClass1EC.A01
            java.lang.String r1 = r0.parentGroupRawJid
            X.1EC r1 = r2.A02(r1)
            if (r1 != 0) goto L_0x08f2
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "CommunitySubgroupsSyncJob/missing parentGroupJid; "
            r2.append(r1)
            java.lang.String r1 = r0.A0D()
            X.C17890vO.A19(r2, r1)
            X.190 r3 = r0.A00
            if (r3 == 0) goto L_0x0913
            java.lang.String r1 = r0.parentGroupRawJid
            r0 = 4
            java.lang.String r2 = X.C29361c9.A0Z(r1, r0)
            r1 = 0
            java.lang.String r0 = "CommunitySubgroupsSyncJob-parentGroupJid"
        L_0x088e:
            r3.A0G(r0, r2, r1)
            return
        L_0x0892:
            boolean r1 = r0 instanceof com.whatsapp.community.sync.CommunityGetParentGroupInfoSyncJob
            if (r1 == 0) goto L_0x08c4
            com.whatsapp.community.sync.CommunityGetParentGroupInfoSyncJob r0 = (com.whatsapp.community.sync.CommunityGetParentGroupInfoSyncJob) r0
            r0.A0D()
            X.1yz r2 = X.AnonymousClass1EC.A01
            java.lang.String r1 = r0.parentGroupRawJid
            X.1EC r3 = r2.A02(r1)
            if (r3 != 0) goto L_0x0901
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "CommunityGetParentGroupInfoSyncJob/missing parentGroupJid; "
            r2.append(r1)
            java.lang.String r1 = r0.A0D()
            X.C17890vO.A19(r2, r1)
            X.190 r3 = r0.A00
            if (r3 == 0) goto L_0x0913
            java.lang.String r1 = r0.parentGroupRawJid
            r0 = 4
            java.lang.String r2 = X.C29361c9.A0Z(r1, r0)
            r1 = 0
            java.lang.String r0 = "CommunityGetParentGroupInfoSyncJob-parentGroupJid"
            goto L_0x088e
        L_0x08c4:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsSyncJob r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsSyncJob) r0
            r0.A0D()
            X.1yz r2 = X.AnonymousClass1EC.A01
            java.lang.String r1 = r0.parentGroupRawJid
            X.1EC r2 = r2.A02(r1)
            if (r2 != 0) goto L_0x0917
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "MemberSuggestedGroupsSyncJob/missing parentGroupJid; "
            r2.append(r1)
            java.lang.String r1 = r0.A0D()
            X.C17890vO.A19(r2, r1)
            X.190 r3 = r0.A00
            if (r3 == 0) goto L_0x0913
            java.lang.String r1 = r0.parentGroupRawJid
            r0 = 4
            java.lang.String r2 = X.C29361c9.A0Z(r1, r0)
            r1 = 0
            java.lang.String r0 = "MemberSuggestedGroupsSyncJob-parentGroupJid"
            goto L_0x088e
        L_0x08f2:
            r0.A0D()
            com.whatsapp.group.GetSubgroupsManager r0 = r0.A01
            if (r0 == 0) goto L_0x08fd
            r0.A05(r1)
            return
        L_0x08fd:
            java.lang.String r2 = "getSubgroupsManager"
            goto L_0x034f
        L_0x0901:
            r0.A0D()
            X.12M r2 = r0.A01
            if (r2 == 0) goto L_0x090f
            java.lang.String r1 = "push_mode_sync"
            r0 = 3
            r2.A0H(r3, r1, r0)
            return
        L_0x090f:
            java.lang.String r2 = "groupXmppMethods"
            goto L_0x034f
        L_0x0913:
            java.lang.String r2 = "crashLogs"
            goto L_0x034f
        L_0x0917:
            X.1kb r1 = r0.A01
            if (r1 == 0) goto L_0x0945
            com.whatsapp.jid.GroupJid r1 = r1.A02(r2)
            X.1EC r1 = X.C42941yz.A00(r1)
            if (r1 != 0) goto L_0x0936
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "MemberSuggestedGroupsSyncJob/missing hintJid; "
            r2.append(r1)
            java.lang.String r0 = r0.A0D()
            X.C17890vO.A19(r2, r0)
            return
        L_0x0936:
            r0.A0D()
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r0.A02
            if (r0 == 0) goto L_0x0941
            r0.A05(r2, r1)
            return
        L_0x0941:
            java.lang.String r2 = "memberSuggestedGroupsManager"
            goto L_0x034f
        L_0x0945:
            java.lang.String r2 = "communityChatManager"
            goto L_0x034f
        L_0x0949:
            java.lang.String r1 = r1.A00()
            java.util.List r2 = X.C18070vi.A0M(r1)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterRecommendedInput r4 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterRecommendedInput
            r4.<init>()
            java.lang.String r1 = "country_codes"
            r4.A06(r1, r2)
            int r1 = r0.limit
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "limit"
            X.8Kx r1 = r4.A02()
            X.C162478Kx.A01(r1, r3, r2)
            X.A7K r3 = X.A7K.A01(r4)
            java.lang.Boolean r2 = X.AnonymousClass000.A0i()
            java.lang.String r1 = "fetch_state"
            r3.A06(r1, r2)
            java.lang.String r1 = "fetch_creation_time"
            r3.A06(r1, r2)
            java.lang.String r1 = "fetch_name"
            r3.A06(r1, r2)
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            X.A7K.A02(r3, r1, r2)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterRecommendedResponseImpl.class
            java.lang.String r1 = "NewsletterRecommended"
            X.A2g r2 = X.AIj.A01(r3, r5, r2, r1)
            X.AzZ r1 = new X.AzZ
            r1.<init>(r0)
            goto L_0x09f9
        L_0x0996:
            java.lang.String r1 = r1.A00()
            java.util.List r2 = X.C18070vi.A0M(r1)
            com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterFiltersInput r3 = new com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterFiltersInput
            r3.<init>()
            java.lang.String r1 = "country_codes"
            r3.A06(r1, r2)
            java.lang.String r2 = r0.query
            java.lang.String r1 = "search_text"
            r3.A05(r1, r2)
            int r1 = r0.limit
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "limit"
            X.8Kx r4 = X.C162478Kx.A00(r4, r2, r1)
            java.lang.String r2 = "filters"
            X.8Kx r1 = r3.A02()
            r4.A06(r1, r2)
            java.lang.String r1 = "sorted_by"
            r4.A06(r6, r1)
            X.A7K r3 = X.A7K.A00()
            java.lang.String r1 = "input"
            X.C108975cc.A0z(r4, r3, r1)
            java.lang.Boolean r2 = X.AnonymousClass000.A0i()
            java.lang.String r1 = "fetch_state"
            r3.A06(r1, r2)
            java.lang.String r1 = "fetch_creation_time"
            r3.A06(r1, r2)
            java.lang.String r1 = "fetch_name"
            r3.A06(r1, r2)
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            X.A7K.A02(r3, r1, r2)
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl> r2 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterSearchResponseImpl.class
            java.lang.String r1 = "NewsletterSearch"
            X.A2g r2 = X.AIj.A01(r3, r5, r2, r1)
            X.Aza r1 = new X.Aza
            r1.<init>(r0)
        L_0x09f9:
            X.1Di r1 = (X.C22821Di) r1
            goto L_0x0a0f
        L_0x09fc:
            X.A2g r2 = r1.A01(r2)
            X.AzY r1 = new X.AzY
            r1.<init>(r0)
            goto L_0x0a0f
        L_0x0a06:
            X.A2g r2 = r1.A01(r2)
            X.Aze r1 = new X.Aze
            r1.<init>(r0)
        L_0x0a0f:
            r2.A04(r1)
            return
        L_0x0a13:
            java.lang.String r0 = "graphqlIqClient"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0a19:
            X.C18070vi.A11(r5)
            r0 = 0
            throw r0
        L_0x0a1e:
            java.lang.String r0 = "GetNewsletterMessagesUpdatesJob/invalid before/after one of them must be set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0a25:
            X.C18070vi.A11(r5)
            throw r4
        L_0x0a29:
            X.C18070vi.A11(r9)
            throw r4
        L_0x0a2d:
            X.1ch r1 = r0.newsletterJid
            X.1ci r2 = r2.A0A(r1)
            boolean r1 = r2 instanceof X.C46162Dk
            if (r1 == 0) goto L_0x0a47
            X.2Dk r2 = (X.C46162Dk) r2
            if (r2 == 0) goto L_0x0a47
            X.9Ig r2 = r2.A02
        L_0x0a3d:
            X.1OZ r1 = r0.A03
            java.lang.String r5 = "messageClient"
            if (r1 != 0) goto L_0x0a49
            X.C18070vi.A11(r5)
            throw r3
        L_0x0a47:
            r2 = r3
            goto L_0x0a3d
        L_0x0a49:
            java.lang.String r7 = r1.A0B()
            long r12 = r0.count
            X.1ch r4 = r0.newsletterJid
            if (r2 == 0) goto L_0x0a9a
            int r2 = r2.ordinal()
            if (r2 == r6) goto L_0x0a97
            r1 = 1
            if (r2 == r1) goto L_0x0a94
            r1 = 2
            if (r2 == r1) goto L_0x0a91
            r1 = 3
            if (r2 != r1) goto L_0x0a9a
            java.lang.String r1 = "owner"
        L_0x0a64:
            X.4A4 r10 = new X.4A4
            r10.<init>((X.C29681ch) r4, (java.lang.String) r1)
            java.lang.Long r1 = r0.beforeServerId
            if (r1 == 0) goto L_0x0a85
            long r1 = r1.longValue()
            r4 = 1
        L_0x0a72:
            X.9Ek r9 = new X.9Ek
            r9.<init>(r1, r4)
        L_0x0a77:
            X.9F7 r8 = new X.9F7
            r11 = r7
            r8.<init>((X.C178779Ek) r9, (X.AnonymousClass4A4) r10, (java.lang.String) r11, (long) r12)
            X.1OZ r4 = r0.A03
            if (r4 != 0) goto L_0x0a9c
            X.C18070vi.A11(r5)
            throw r3
        L_0x0a85:
            java.lang.Long r1 = r0.afterServerId
            if (r1 == 0) goto L_0x0a8f
            long r1 = r1.longValue()
            r4 = 0
            goto L_0x0a72
        L_0x0a8f:
            r9 = 0
            goto L_0x0a77
        L_0x0a91:
            java.lang.String r1 = "admin"
            goto L_0x0a64
        L_0x0a94:
            java.lang.String r1 = "subscriber"
            goto L_0x0a64
        L_0x0a97:
            java.lang.String r1 = "guest"
            goto L_0x0a64
        L_0x0a9a:
            r1 = 0
            goto L_0x0a64
        L_0x0a9c:
            java.lang.Object r6 = r8.A00
            X.1ca r6 = (X.C29621ca) r6
            X.Aco r5 = new X.Aco
            r5.<init>((com.whatsapp.newsletter.iq.GetNewsletterMessagesJob) r0, (X.AnonymousClass9F7) r8)
            r9 = 32000(0x7d00, double:1.581E-319)
            r8 = 368(0x170, float:5.16E-43)
            r4.A0I(r5, r6, r7, r8, r9)
            return
        L_0x0aad:
            X.C18070vi.A11(r2)
            throw r3
        L_0x0ab1:
            r0 = 360(0x168, float:5.04E-43)
            r1.A08(r2, r3, r0)
            return
        L_0x0ab7:
            java.lang.String r0 = "mediaHash and fileType not both present for upload URL generation"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0abe:
            java.lang.String r2 = r0.remoteJidRawString
            X.1Dt r1 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r7 = X.C22911Dt.A00(r2)
            java.lang.String r2 = r0.participantDeviceJidRawString
            X.1E0 r1 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r6 = r1.A06(r2)
            X.205[] r1 = new X.AnonymousClass205[r5]
            java.lang.Object[] r10 = r4.toArray(r1)
            X.205[] r10 = (X.AnonymousClass205[]) r10
            int r11 = r0.status
            long r12 = r0.timestamp
            X.1ya r8 = r0.receiptPrivacyMode
            r9 = 0
            X.AVb r5 = new X.AVb
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.2rG r2 = r0.A00
            goto L_0x0af1
        L_0x0ae5:
            int r11 = r0.status
            X.1ya r8 = r0.receiptPrivacyMode
            r9 = 0
            X.AVa r5 = new X.AVa
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.2rG r2 = r0.A00
        L_0x0af1:
            r0 = 10000(0x2710, double:4.9407E-320)
            X.1Ug r0 = r2.A01(r5, r0)
            r0.get()
        L_0x0afa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.whispersystems.jobqueue.Job.A0A():void");
    }

    public boolean A0B() {
        for (Requirement Bfv : this.parameters.requirements) {
            if (!Bfv.Bfv()) {
                return false;
            }
        }
        return true;
    }

    public boolean A0C(Exception exc) {
        Throwable th;
        String str;
        String str2;
        C29621ca r0;
        int A002;
        if ((this instanceof UpdateNewsletterGraphqlJob) || (this instanceof NewsletterFollowersGraphqlJob) || (this instanceof NewsletterDirectoryCategoriesPreviewGQLJob) || (this instanceof GetDirectoryNewslettersGraphqlJob) || (this instanceof DeleteNewsletterGraphqlJob) || (this instanceof BaseNewsletterDirectoryV2GraphqlJob) || (this instanceof BaseMetadataNewsletterGraphqlJob)) {
            return false;
        }
        if (!(this instanceof GetNewsletterMyAddOnMessagesJob)) {
            if ((this instanceof GetNewsletterMessagesUpdatesJob) || (this instanceof GetNewsletterMessagesJob)) {
                return false;
            }
            if (this instanceof SendEngagedReceiptJob) {
                StringBuilder A0K = C18070vi.A0K(exc);
                A0K.append("exception while running sent engaged receipts job: ");
                C17890vO.A13(SendEngagedReceiptJob.A00((SendEngagedReceiptJob) this), A0K, exc);
            } else if (this instanceof SendDeleteHistorySyncMmsJob) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("SendDeleteHistorySyncMmsJob/ exception while running job chunkId=");
                C17890vO.A1B(A10, ((SendDeleteHistorySyncMmsJob) this).chunkId);
            } else if (this instanceof ReceiptProcessingJob) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("ReceiptProcessingJob/onShouldRetry/exception while running param=");
                C17890vO.A1B(A102, ReceiptProcessingJob.A00((ReceiptProcessingJob) this));
            } else if (this instanceof ReceiptMultiTargetProcessingJob) {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("ReceiptMultiTargetProcessingJob/onShouldRetry/exception while running param=");
                C17890vO.A1B(A103, ReceiptMultiTargetProcessingJob.A00((ReceiptMultiTargetProcessingJob) this));
            } else if (this instanceof GetStatusPrivacyJob) {
                StringBuilder A0K2 = C18070vi.A0K(exc);
                A0K2.append("exception while running get status privacy job");
                StringBuilder A104 = AnonymousClass000.A10();
                C17900vP.A0q(A104, (GetStatusPrivacyJob) this);
                C17890vO.A13(A104.toString(), A0K2, exc);
            } else if (this instanceof DeleteAccountFromHsmServerJob) {
                StringBuilder A105 = AnonymousClass000.A10();
                StringBuilder A0y = AnonymousClass8BT.A0y("DeleteAccountFromHsmServerJob/exception while running delete account from hsm server job", A105);
                C17900vP.A0q(A0y, this);
                C17890vO.A13(A0y.toString(), A105, exc);
            } else if (this instanceof FetchTruncatedGroupsJob) {
                C18070vi.A0d(exc, 0);
                if ((exc instanceof AnonymousClass9LO) || (exc.getCause() instanceof AnonymousClass9LO)) {
                    return true;
                }
                return false;
            } else {
                CommunityOneTimeSyncJob communityOneTimeSyncJob = (CommunityOneTimeSyncJob) this;
                C122936Sm r2 = null;
                if (exc != null) {
                    th = exc.getCause();
                } else {
                    th = null;
                }
                if (th instanceof C122936Sm) {
                    r2 = (C122936Sm) th;
                }
                boolean z = true;
                if (r2 == null || (r0 = r2.node) == null || (400 <= (A002 = C60482o6.A00(r0)) && A002 < 500)) {
                    str = "";
                } else {
                    z = false;
                    str = " not";
                }
                StringBuilder A106 = AnonymousClass000.A10();
                if (communityOneTimeSyncJob instanceof CommunitySubGroupsSyncJob) {
                    str2 = "CommunitySubgroupsSyncJob";
                } else if (communityOneTimeSyncJob instanceof CommunityGetParentGroupInfoSyncJob) {
                    str2 = "CommunityGetParentGroupInfoSyncJob";
                } else {
                    str2 = "MemberSuggestedGroupsSyncJob";
                }
                A106.append(str2);
                A106.append("/exception while running iq call,");
                A106.append(str);
                A106.append(" retrying; ");
                C17890vO.A13(communityOneTimeSyncJob.A0D(), A106, exc);
                return z;
            }
        }
        return true;
    }

    public Job(JobParameters jobParameters) {
        this.parameters = jobParameters;
    }

    public void A07(long j) {
        this.A01 = j;
    }
}
