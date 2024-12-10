package X;

import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;

/* renamed from: X.8Gf  reason: invalid class name */
public class AnonymousClass8Gf extends C24121Iy {
    public final int A00;
    public final Object A01;

    public AnonymousClass8Gf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        String str;
        Class cls2 = cls;
        switch (this.A00) {
            case 0:
                if (cls2.isAssignableFrom(AnonymousClass96L.class)) {
                    BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A01;
                    AnonymousClass11P r10 = brazilPaymentCardDetailsActivity.A05;
                    AnonymousClass10I r9 = brazilPaymentCardDetailsActivity.A0E;
                    C20284AEs aEs = brazilPaymentCardDetailsActivity.A04;
                    AnonymousClass1QS r6 = brazilPaymentCardDetailsActivity.A0A;
                    A4K a4k = brazilPaymentCardDetailsActivity.A08;
                    AnonymousClass1QL r4 = brazilPaymentCardDetailsActivity.A07;
                    C195929uA r3 = brazilPaymentCardDetailsActivity.A09;
                    C31061ex r2 = brazilPaymentCardDetailsActivity.A03;
                    A5H a5h = brazilPaymentCardDetailsActivity.A07;
                    return new AnonymousClass96L(r10, aEs, r4, r2, r6, brazilPaymentCardDetailsActivity.A06, a5h, a4k, r3, r9);
                }
                throw AnonymousClass000.A0k("View Model type mismatch. Expected a BrazilPaymentCardDetailsViewModel");
            case 1:
                if (cls2.isAssignableFrom(C161578Ga.class)) {
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this.A01;
                    C18030ve r5 = indiaUpiSendPaymentToVpaFragment.A07;
                    AnonymousClass10I r42 = indiaUpiSendPaymentToVpaFragment.A0L;
                    C20752AXh aXh = indiaUpiSendPaymentToVpaFragment.A0A;
                    A7U a7u = indiaUpiSendPaymentToVpaFragment.A0B;
                    AnonymousClass1QR r1 = indiaUpiSendPaymentToVpaFragment.A05;
                    return new C161578Ga(r1, r5, aXh, a7u, indiaUpiSendPaymentToVpaFragment.A0E, r42);
                }
                throw AnonymousClass000.A0k("Invalid viewModel for IndiaUpiSendToVpaViewModel");
            case 2:
                if (cls2.isAssignableFrom(AnonymousClass8FV.class)) {
                    return new AnonymousClass8FV(((IndiaUpiPaymentInviteFragment) this.A01).A07);
                }
                throw AnonymousClass000.A0k("Invalid viewModel");
            default:
                C18070vi.A0d(cls2, 0);
                if (cls2.isAssignableFrom(AnonymousClass8GT.class)) {
                    RestoreFromConsumerDatabaseActivity restoreFromConsumerDatabaseActivity = (RestoreFromConsumerDatabaseActivity) this.A01;
                    AnonymousClass1XL r11 = (AnonymousClass1XL) C18070vi.A0E(restoreFromConsumerDatabaseActivity.A0A);
                    AnonymousClass1Cd r0 = restoreFromConsumerDatabaseActivity.A05;
                    AnonymousClass1Cd r17 = r0;
                    if (r0 != null) {
                        C19830z4 r32 = restoreFromConsumerDatabaseActivity.A0A;
                        C18070vi.A0X(r32);
                        C27371Vv r02 = restoreFromConsumerDatabaseActivity.A0D;
                        C27371Vv r16 = r02;
                        if (r02 != null) {
                            C27391Vx r13 = restoreFromConsumerDatabaseActivity.A0G;
                            if (r13 != null) {
                                C27361Vu r12 = restoreFromConsumerDatabaseActivity.A0F;
                                if (r12 != null) {
                                    AnonymousClass19D r102 = restoreFromConsumerDatabaseActivity.A07;
                                    if (r102 != null) {
                                        AnonymousClass1WZ r92 = restoreFromConsumerDatabaseActivity.A06;
                                        if (r92 != null) {
                                            AnonymousClass10I r18 = restoreFromConsumerDatabaseActivity.A05;
                                            C18070vi.A0X(r18);
                                            C33621j7 r14 = restoreFromConsumerDatabaseActivity.A02;
                                            if (r14 != null) {
                                                C219017v r7 = restoreFromConsumerDatabaseActivity.A09;
                                                if (r7 != null) {
                                                    AnonymousClass00H r03 = restoreFromConsumerDatabaseActivity.A0O;
                                                    if (r03 != null) {
                                                        C46152Dc r62 = (C46152Dc) C18070vi.A0E(r03);
                                                        AnonymousClass4aW r52 = restoreFromConsumerDatabaseActivity.A0K;
                                                        if (r52 != null) {
                                                            AnonymousClass1Nb r43 = restoreFromConsumerDatabaseActivity.A0J;
                                                            if (r43 != null) {
                                                                C203911y r33 = restoreFromConsumerDatabaseActivity.A0A;
                                                                if (r33 != null) {
                                                                    C33841jT r22 = restoreFromConsumerDatabaseActivity.A0C;
                                                                    if (r22 != null) {
                                                                        AnonymousClass00H r04 = restoreFromConsumerDatabaseActivity.A0P;
                                                                        if (r04 != null) {
                                                                            C170178or r15 = (C170178or) C18070vi.A0E(r04);
                                                                            AnonymousClass1NR r05 = restoreFromConsumerDatabaseActivity.A0H;
                                                                            if (r05 != null) {
                                                                                C58802lH r152 = restoreFromConsumerDatabaseActivity.A0B;
                                                                                if (r152 != null) {
                                                                                    AnonymousClass10I r31 = r18;
                                                                                    C58802lH r222 = r152;
                                                                                    C27371Vv r24 = r16;
                                                                                    C27391Vx r26 = r13;
                                                                                    return new AnonymousClass8GT(r11, r14, r62, r32, r17, r92, r102, r7, r33, r222, r22, r24, r12, r26, r05, r43, r52, r15, r31);
                                                                                }
                                                                                str = "postRestoreInitializer";
                                                                            } else {
                                                                                str = "migrateFileDirectlyHelper";
                                                                            }
                                                                        } else {
                                                                            str = "stickerBackupProducer";
                                                                        }
                                                                    } else {
                                                                        str = "registrationManager";
                                                                    }
                                                                } else {
                                                                    str = "sendMessageMethods";
                                                                }
                                                            } else {
                                                                str = "chatSettingsStore";
                                                            }
                                                        } else {
                                                            str = "wallPaperManager";
                                                        }
                                                    } else {
                                                        str = "chatLockBackup";
                                                    }
                                                } else {
                                                    str = "messageHandler";
                                                }
                                            } else {
                                                str = "backupManager";
                                            }
                                        } else {
                                            str = "messageStoreStateResetter";
                                        }
                                    } else {
                                        str = "preChatdAbProps";
                                    }
                                } else {
                                    str = "interAppCommunicationManager";
                                }
                            } else {
                                str = "mediaMigrationObservers";
                            }
                        } else {
                            str = "directMigrationLogging";
                        }
                    } else {
                        str = "messageStoreManager";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                throw AnonymousClass000.A0k("Invalid viewModel");
        }
    }
}
