package X;

import android.graphics.Bitmap;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3VX  reason: invalid class name */
public abstract class AnonymousClass3VX extends AnonymousClass1J2 implements BDF {
    public void BmO(C89344cJ r1) {
    }

    public void Bn6(long j) {
    }

    public void BnO(Bitmap bitmap, boolean z) {
    }

    public /* synthetic */ void BnP(boolean z, String str) {
    }

    public void Bnc() {
    }

    public void Bvf(boolean z) {
    }

    public void Byq(UserJid userJid, boolean z) {
    }

    public void Byr(UserJid userJid, boolean z) {
    }

    public void Bz3(C136336te r1, boolean z) {
    }

    public void C08(UserJid userJid) {
    }

    public void C33(UserJid userJid, boolean z, boolean z2) {
    }

    public void C36(UserJid userJid, boolean z, boolean z2) {
    }

    public void C4X(int i) {
    }

    public void C4Y(UserJid userJid, boolean z, boolean z2) {
    }

    public void C9p(UserJid userJid, boolean z) {
    }

    public void Blp(int i, boolean z, boolean z2) {
        if (this instanceof VoiceChatBottomSheetViewModel) {
            AnonymousClass1DT r1 = ((VoiceChatBottomSheetViewModel) this).A0B;
            AnonymousClass4VB r2 = (AnonymousClass4VB) r1.A06();
            if (r2 != null) {
                List<Object> list = r2.A03;
                ArrayList A0D = C29351c6.A0D(list);
                for (Object obj : list) {
                    boolean z3 = true;
                    if (obj instanceof C76453nL) {
                        C76453nL r3 = (C76453nL) obj;
                        if (i != 3) {
                            z3 = false;
                        }
                        obj = new C76453nL(r3.A01, z, z3);
                    } else if (obj instanceof C76443nK) {
                        C76443nK r32 = (C76443nK) obj;
                        if (i != 1) {
                            z3 = false;
                        }
                        obj = new C76443nK(z3, r32.A01);
                    } else if (obj instanceof C76463nM) {
                        obj = new C76463nM(z2, ((C76463nM) obj).A02);
                    } else if (obj instanceof C76473nN) {
                        obj = new C76473nN(z2, ((C76473nN) obj).A03);
                    }
                    A0D.add(obj);
                }
                r1.A0E(new AnonymousClass4VB(r2.A01, r2.A02, A0D, r2.A07, r2.A05, r2.A04, r2.A06));
            }
        } else if (this instanceof AudioChatCallingViewModel) {
            AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this;
            if (audioChatCallingViewModel.A0A) {
                AnonymousClass4R3 r22 = audioChatCallingViewModel.A02;
                if (r22 == null) {
                    r22 = new AnonymousClass4R3(audioChatCallingViewModel.A0H, audioChatCallingViewModel.A0P);
                    audioChatCallingViewModel.A02 = r22;
                }
                if (i == 2) {
                    r22.A00(audioChatCallingViewModel.A0M);
                    return;
                }
                r22.A00((C107215Yv) null);
                AudioChatCallingViewModel.A06(audioChatCallingViewModel, false);
            }
        }
    }

    public void Bn8() {
        if (this instanceof ParticipantsListViewModel) {
            ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) this;
            if (C72463Mc.A1Z(participantsListViewModel.A0O)) {
                participantsListViewModel.A07.A02(C27621Wu.A00);
            }
        } else if (this instanceof MenuBottomSheetViewModel) {
            MenuBottomSheetViewModel menuBottomSheetViewModel = (MenuBottomSheetViewModel) this;
            if (C72463Mc.A1Z(menuBottomSheetViewModel.A09)) {
                menuBottomSheetViewModel.A03.A0E((Object) null);
            }
        }
    }

    public void BnL(C86534Sa r7) {
        if (this instanceof CallSuggestionsViewModel) {
            CallSuggestionsViewModel callSuggestionsViewModel = (CallSuggestionsViewModel) this;
            C18070vi.A0d(r7, 0);
            if (r7.A08 == null && C40811vJ.A0f(r7.A0B)) {
                C201110w r2 = r7.A06;
                if (!C18070vi.A18(r2.keySet(), callSuggestionsViewModel.A01)) {
                    callSuggestionsViewModel.A01 = r2.keySet();
                    AnonymousClass1OX A00 = C41561wd.A00(callSuggestionsViewModel);
                    AnonymousClass5WH A01 = C30451dy.A01(AnonymousClass00R.A00, callSuggestionsViewModel.A08, new CallSuggestionsViewModel$maybeReloadSuggestions$1(callSuggestionsViewModel, (C30391dr) null), A00);
                    AnonymousClass3Ma.A1R(callSuggestionsViewModel.A02);
                    callSuggestionsViewModel.A02 = A01;
                }
            }
        } else if (this instanceof ParticipantsListViewModel) {
            ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) this;
            boolean A002 = AnonymousClass72U.A00(r7.A0B);
            participantsListViewModel.A0F.A0G(Boolean.valueOf(r7.A0G));
            AnonymousClass7RF r1 = new AnonymousClass7RF(participantsListViewModel, r7, 18, A002);
            participantsListViewModel.A01 = r1;
            participantsListViewModel.A0J.CGN(r1);
        } else if (this instanceof VoiceChatBottomSheetViewModel) {
            VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = (VoiceChatBottomSheetViewModel) this;
            C18070vi.A0d(r7, 0);
            voiceChatBottomSheetViewModel.A0L.CGN(new C21431Ajy(voiceChatBottomSheetViewModel, r7, 23));
        } else if (this instanceof AudioChatCallingViewModel) {
            AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this;
            C18070vi.A0d(r7, 0);
            boolean z = r7.A0G;
            boolean z2 = false;
            if (!z) {
                AnonymousClass3MY.A1L(audioChatCallingViewModel.A0F, false);
            }
            boolean z3 = audioChatCallingViewModel.A0A;
            CallState callState = r7.A0B;
            if (callState == CallState.CALLING || callState == CallState.PRE_ACCEPT_RECEIVED || callState == CallState.ACTIVE || callState == CallState.ACCEPT_SENT || callState == CallState.REJOINING || callState == CallState.CONNECTED_LONELY) {
                z2 = true;
            }
            audioChatCallingViewModel.A0A = z2;
            if (callState == CallState.NONE) {
                audioChatCallingViewModel.A09 = false;
                audioChatCallingViewModel.A06 = null;
                AudioChatCallingViewModel.A04(audioChatCallingViewModel);
            }
            String str = r7.A0C;
            boolean z4 = audioChatCallingViewModel.A0A;
            if (!z4) {
                str = null;
            }
            audioChatCallingViewModel.A05 = str;
            if (z3 != z4) {
                if (z4) {
                    audioChatCallingViewModel.A0L.A01(audioChatCallingViewModel);
                } else {
                    AudioChatCallingViewModel.A04(audioChatCallingViewModel);
                }
            }
            if (z) {
                AudioChatCallingViewModel.A03(r7, audioChatCallingViewModel);
            }
        }
    }

    public void BnM(C86534Sa r2) {
        if (this instanceof AudioChatCallingViewModel) {
            C18070vi.A0d(r2, 0);
            BnL(r2);
        }
    }

    public void C07(UserJid[] userJidArr, int[] iArr) {
        AnonymousClass1DT r1;
        Integer valueOf;
        if (this instanceof AudioChatCallingViewModel) {
            AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this;
            boolean A15 = C18070vi.A15(userJidArr, iArr);
            UserJid userJid = audioChatCallingViewModel.A03;
            if (userJid != null) {
                int A0H = C200410p.A0H(userJidArr, userJid);
                if (A0H < 0 || A0H > iArr.length - 1) {
                    r1 = audioChatCallingViewModel.A0E;
                    valueOf = Integer.valueOf(A15 ? 1 : 0);
                } else {
                    r1 = audioChatCallingViewModel.A0E;
                    valueOf = Integer.valueOf(iArr[A0H]);
                }
                r1.A0F(valueOf);
            }
        } else if (this instanceof C76683nn) {
            AnonymousClass3PV r4 = ((C76683nn) this).A00;
            if (r4.A06.A01() == 0) {
                int i = 0;
                int i2 = 0;
                while (i2 < userJidArr.length && !userJidArr[i2].equals(r4.A05)) {
                    i2++;
                }
                VoiceChatMiniPillWave voiceChatMiniPillWave = (VoiceChatMiniPillWave) r4.A06.A02();
                if (i2 < iArr.length) {
                    i = iArr[i2];
                }
                voiceChatMiniPillWave.A00(i);
            }
        }
    }

    public void C5Q(String str, boolean z) {
        if (this instanceof MenuBottomSheetViewModel) {
            MenuBottomSheetViewModel menuBottomSheetViewModel = (MenuBottomSheetViewModel) this;
            AnonymousClass4T4 r1 = menuBottomSheetViewModel.A00;
            if (r1 == null || (!r1.A00.equals(str) && r1.A01 != z)) {
                menuBottomSheetViewModel.A00 = new AnonymousClass4T4(str, z);
            }
            menuBottomSheetViewModel.A08.A0F((Object) null);
            AnonymousClass6IR A0t = AnonymousClass3MX.A0t(2131896095);
            ArrayList A13 = AnonymousClass000.A13();
            C87614Wg.A00(C1402670q.A02(new Object[]{AnonymousClass3MX.A0t(2131899103)}, 2131896097), A13, 4, 2131231930);
            C87614Wg.A00(AnonymousClass3MX.A0t(2131889049), A13, 5, 2131231835);
            C87614Wg.A00(AnonymousClass3MX.A0t(2131896095), A13, 6, 2131232294);
            menuBottomSheetViewModel.A03.A0F(new C85454Nl(AnonymousClass1IX.copyOf((Collection) A13), (UserJid) null, A0t, true));
        }
    }

    public static void A00(C175258yP r0, AnonymousClass3VX r1) {
        r1.BnL(r0.A07());
    }
}
