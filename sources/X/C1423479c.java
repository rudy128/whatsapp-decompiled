package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.bot.metaai.voice.MetaAiVoiceMultimodalComposerActivity;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.imagine.InputPrompt;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet;
import com.whatsapp.status.audienceselector.StatusPrivacyActivity;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.79c  reason: invalid class name and case insensitive filesystem */
public class C1423479c implements AnonymousClass02j {
    public final int A00;
    public final Object A01;

    public C1423479c(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bkx(Object obj) {
        String str;
        C136786uO r0;
        int i;
        Object obj2;
        AnonymousClass1DT r02;
        String str2;
        Bundle extras;
        Long l;
        String str3;
        String str4;
        C136786uO r03;
        int i2;
        switch (this.A00) {
            case 0:
                AiImagineBottomSheet aiImagineBottomSheet = (AiImagineBottomSheet) this.A01;
                C005702m r15 = (C005702m) obj;
                C18070vi.A0d(r15, 1);
                if (r15.A00 == -1) {
                    C111225jD r4 = aiImagineBottomSheet.A0J;
                    Editable editable = null;
                    if (r4 == null) {
                        AnonymousClass3MW.A1H();
                        throw null;
                    }
                    InputPrompt inputPrompt = aiImagineBottomSheet.A0Q;
                    if (inputPrompt != null) {
                        editable = inputPrompt.getEditable();
                    }
                    if (((C38731rn) r4.A0t.get()).A01() && C108945cZ.A0c(r4.A0n).A08()) {
                        r4.A0V(AnonymousClass6RH.LOADING_SCREEN_GENERATING_IMAGINE_ME);
                        if (r4.A05 == AnonymousClass00R.A01) {
                            r4.A0G.A0F(AnonymousClass000.A13());
                            r4.A0O.A0F((Object) null);
                        }
                        C111225jD.A06(AnonymousClass6RH.IMAGINE_ME, r4, String.valueOf(editable), 3, false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                MetaAiVoiceMultimodalComposerActivity metaAiVoiceMultimodalComposerActivity = (MetaAiVoiceMultimodalComposerActivity) this.A01;
                C005702m r152 = (C005702m) obj;
                C18070vi.A0d(r152, 1);
                Intent intent = r152.A01;
                if (intent != null && r152.A00 == -1) {
                    C18100vl r2 = metaAiVoiceMultimodalComposerActivity.A0N;
                    C140016zo r1 = (C140016zo) C108945cZ.A0m(r2).A0E.A06();
                    if (r1 != null && (r0 = metaAiVoiceMultimodalComposerActivity.A0C) != null) {
                        if (r0.A04(intent, r1)) {
                            AnonymousClass64Z r12 = C108945cZ.A0m(r2).A0I.A01;
                            if (r12 != null) {
                                r12.A03 = AnonymousClass000.A0i();
                            }
                            i = 2131892211;
                        } else {
                            i = 2131892210;
                        }
                        MetaAiVoiceMultimodalComposerActivity.A0V(metaAiVoiceMultimodalComposerActivity, i);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ScreenShareViewModel.A07((C005702m) obj, (ScreenShareViewModel) this.A01);
                return;
            case 3:
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) this.A01;
                C005702m r153 = (C005702m) obj;
                C18070vi.A0d(r153, 1);
                if (r153.A00 == -1) {
                    Intent intent2 = r153.A01;
                    if (intent2 != null) {
                        Bundle extras2 = intent2.getExtras();
                        if (extras2 != null) {
                            l = Long.valueOf(extras2.getLong("selected_value"));
                        } else {
                            l = null;
                        }
                        Bundle extras3 = intent2.getExtras();
                        if (extras3 != null) {
                            str3 = extras3.getString("input_name");
                        } else {
                            str3 = null;
                        }
                        Bundle extras4 = intent2.getExtras();
                        if (extras4 != null) {
                            str4 = extras4.getString("input_type");
                        } else {
                            str4 = null;
                        }
                        if (l != null && str3 != null && str4 != null) {
                            SimpleDateFormat simpleDateFormat = C197479wl.A01;
                            String format = C197479wl.A01.format(new Date(l.longValue()));
                            C18070vi.A0X(format);
                            obj2 = new C135236rs(format, str3, str4);
                            WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0B;
                            if (waFlowsViewModel == null) {
                                C18070vi.A11("waFlowsViewModel");
                                throw null;
                            }
                            r02 = waFlowsViewModel.A03;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    Intent intent3 = r153.A01;
                    if (intent3 == null || (extras = intent3.getExtras()) == null || (str2 = extras.getString("input_name")) == null) {
                        str2 = "";
                    }
                    obj2 = new C134336qQ(str2);
                    WaFlowsViewModel waFlowsViewModel2 = flowsWebBottomSheetContainer.A0B;
                    if (waFlowsViewModel2 == null) {
                        C18070vi.A11("waFlowsViewModel");
                        throw null;
                    }
                    r02 = waFlowsViewModel2.A05;
                }
                r02.A0E(obj2);
                return;
            case 4:
                GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A01;
                C005702m r154 = (C005702m) obj;
                C18070vi.A0d(r154, 1);
                int i3 = r154.A00;
                if (i3 == -1) {
                    Log.i("GalleryTabHostFragment/googlePhotoPickerActivityLauncherResult/onActivityResult/success");
                    Intent intent4 = r154.A01;
                    if (intent4 != null) {
                        List parcelableArrayListExtra = intent4.getParcelableArrayListExtra("extra_selected_media_uri");
                        if (parcelableArrayListExtra == null) {
                            parcelableArrayListExtra = C18460wS.A00;
                        }
                        ArrayList A13 = AnonymousClass000.A13();
                        Iterator it = parcelableArrayListExtra.iterator();
                        while (it.hasNext()) {
                            Uri A0M = C108945cZ.A0M(it);
                            try {
                                galleryTabHostFragment.A14().grantUriPermission("com.whatsapp", A0M, 1);
                                A13.add(A0M);
                            } catch (Exception e) {
                                Log.e("GalleryTabHostFragment/googlePhotoPickerActivityLauncherResult/onActivityResult/error", e);
                            }
                        }
                        if (C17880vN.A1X(A13)) {
                            GalleryTabsViewModel A0P = C108965cb.A0P(galleryTabHostFragment);
                            ArrayList A0D = C29351c6.A0D(A13);
                            Iterator it2 = A13.iterator();
                            while (it2.hasNext()) {
                                A0D.add(new AnonymousClass7H0(C108945cZ.A0M(it2)));
                            }
                            A0P.A05.A0F(new AnonymousClass7HI(C29431cG.A0t(C29431cG.A12(A0D))));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == 0) {
                    Log.i("GalleryTabHostFragment/googlePhotoPickerActivityLauncherResult/onActivityResult/canceled");
                    return;
                } else {
                    return;
                }
            case 5:
                C22821Di r22 = (C22821Di) this.A01;
                ArrayList arrayList = null;
                if (obj != null) {
                    arrayList = AnonymousClass1ZU.A06(obj);
                }
                if (r22 != null) {
                    r22.invoke(arrayList);
                    return;
                }
                return;
            case 6:
                C22821Di r13 = (C22821Di) this.A01;
                C18070vi.A0d(obj, 1);
                if (r13 != null) {
                    r13.invoke(obj);
                    return;
                }
                return;
            case 7:
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) this.A01;
                C005702m r155 = (C005702m) obj;
                C18070vi.A0d(r155, 1);
                if (r155.A00 == -1) {
                    mediaComposerFragment.startActivityForResult(MediaComposerFragment.A0I(mediaComposerFragment.A1D(), mediaComposerFragment), 2);
                    return;
                }
                return;
            case 8:
                MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet = (MetaAiVoiceInputBottomSheet) this.A01;
                C005702m r156 = (C005702m) obj;
                C18070vi.A0d(r156, 1);
                Intent intent5 = r156.A01;
                if (intent5 != null && r156.A00 == -1) {
                    C18100vl r23 = metaAiVoiceInputBottomSheet.A0S;
                    C140016zo r14 = (C140016zo) C108945cZ.A0m(r23).A0E.A06();
                    if (r14 != null && (r03 = metaAiVoiceInputBottomSheet.A06) != null) {
                        if (r03.A04(intent5, r14)) {
                            AnonymousClass64Z r16 = C108945cZ.A0m(r23).A0I.A01;
                            if (r16 != null) {
                                r16.A03 = AnonymousClass000.A0i();
                            }
                            i2 = 2131892211;
                        } else {
                            i2 = 2131892210;
                        }
                        MetaAiVoiceInputBottomSheet.A00(metaAiVoiceInputBottomSheet, i2);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                StatusPrivacyActivity statusPrivacyActivity = (StatusPrivacyActivity) this.A01;
                C005702m r157 = (C005702m) obj;
                C18070vi.A0d(r157, 1);
                if (r157.A00 == -1) {
                    AnonymousClass00H r04 = statusPrivacyActivity.A0J;
                    if (r04 == null) {
                        str = "xFamilyCrosspostManager";
                        break;
                    } else {
                        AnonymousClass730.A01((C114375qh) null, (C38471rL) null, (AnonymousClass730) C108945cZ.A12(r04).A07.get(), "status_privacy_activity", 2131889151, 0, true);
                        statusPrivacyActivity.A05.CGP(new C146527Pl(statusPrivacyActivity, (Object) null, 42));
                        return;
                    }
                } else {
                    return;
                }
            case 10:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = (StatusPrivacyBottomSheetDialogFragment) this.A01;
                C005702m r158 = (C005702m) obj;
                C18070vi.A0d(r158, 1);
                if (r158.A00 == -1) {
                    Intent intent6 = r158.A01;
                    C17960vV.A07(intent6);
                    C18070vi.A0X(intent6);
                    AnonymousClass00H r05 = statusPrivacyBottomSheetDialogFragment.A0D;
                    if (r05 != null) {
                        AnonymousClass727 A0u = C108945cZ.A0u(r05);
                        Bundle extras5 = intent6.getExtras();
                        if (extras5 != null) {
                            AnonymousClass77K A02 = A0u.A02(extras5);
                            C17960vV.A07(A02);
                            C18070vi.A0X(A02);
                            if (!statusPrivacyBottomSheetDialogFragment.A0L) {
                                AnonymousClass77K r06 = statusPrivacyBottomSheetDialogFragment.A02;
                                if (r06 != null) {
                                    if (!A02.equals(r06)) {
                                        statusPrivacyBottomSheetDialogFragment.A0L = true;
                                    }
                                }
                                C18070vi.A11("statusDistributionInfo");
                                throw null;
                            }
                            statusPrivacyBottomSheetDialogFragment.A02 = A02;
                            C133586p1 r24 = statusPrivacyBottomSheetDialogFragment.A07;
                            if (r24 != null) {
                                int size = A02.A01.size();
                                AnonymousClass77K r07 = statusPrivacyBottomSheetDialogFragment.A02;
                                if (r07 != null) {
                                    r24.A01(size, r07.A02.size());
                                }
                                C18070vi.A11("statusDistributionInfo");
                                throw null;
                            }
                            C18070vi.A11("statusPrivacyBottomSheetController");
                            throw null;
                        }
                        throw C17890vO.A0K();
                    }
                    C18070vi.A11("statusAudienceRepository");
                    throw null;
                }
                C133586p1 r17 = statusPrivacyBottomSheetDialogFragment.A07;
                if (r17 != null) {
                    AnonymousClass77K r08 = statusPrivacyBottomSheetDialogFragment.A02;
                    if (r08 != null) {
                        r17.A00(r08.A00);
                        return;
                    }
                    C18070vi.A11("statusDistributionInfo");
                    throw null;
                }
                C18070vi.A11("statusPrivacyBottomSheetController");
                throw null;
            case 11:
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment2 = (StatusPrivacyBottomSheetDialogFragment) this.A01;
                C24661Le r09 = statusPrivacyBottomSheetDialogFragment2.A03;
                if (r09 != null) {
                    int A05 = r09.A05();
                    C24661Le r010 = statusPrivacyBottomSheetDialogFragment2.A03;
                    if (r010 != null) {
                        ArrayList A0A = r010.A0A();
                        C24661Le r011 = statusPrivacyBottomSheetDialogFragment2.A03;
                        if (r011 != null) {
                            AnonymousClass77K r6 = new AnonymousClass77K(A0A, r011.A0B(), A05, false, false, false, false);
                            statusPrivacyBottomSheetDialogFragment2.A02 = r6;
                            C133586p1 r25 = statusPrivacyBottomSheetDialogFragment2.A07;
                            if (r25 != null) {
                                r25.A00(r6.A00);
                                C133586p1 r26 = statusPrivacyBottomSheetDialogFragment2.A07;
                                if (r26 != null) {
                                    AnonymousClass77K r012 = statusPrivacyBottomSheetDialogFragment2.A02;
                                    if (r012 != null) {
                                        int size2 = r012.A01.size();
                                        AnonymousClass77K r013 = statusPrivacyBottomSheetDialogFragment2.A02;
                                        if (r013 != null) {
                                            r26.A01(size2, r013.A02.size());
                                            return;
                                        }
                                    }
                                    C18070vi.A11("statusDistributionInfo");
                                    throw null;
                                }
                            }
                            C18070vi.A11("statusPrivacyBottomSheetController");
                            throw null;
                        }
                    }
                }
                str = "statusStore";
                break;
            default:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A01;
                voipActivityV2.A18.A0D((Integer) null);
                C72453Mb.A1O(voipActivityV2.A1d);
                return;
        }
        C18070vi.A11(str);
        throw null;
    }
}
