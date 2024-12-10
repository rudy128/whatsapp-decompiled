package X;

import android.content.Intent;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer;
import com.whatsapp.calling.header.CallHeaderStateHolder;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.LinkedHashMap;

/* renamed from: X.7DJ  reason: invalid class name */
public class AnonymousClass7DJ implements C108525bq {
    public final int A00;
    public final Object A01;

    public AnonymousClass7DJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BlZ() {
        C131136kZ r0;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            r0 = ((FloatingViewDraggableContainer) obj).getStateHolder();
        } else {
            r0 = (C131136kZ) ((CallGrid) obj).A0P.get();
        }
        if (r0.A02 != C122686Ri.FOCUS) {
            r0.A08.A0F(C122566Qw.AR_EFFECTS);
        }
    }

    public void Bnh() {
        C41731wy r1;
        Object obj;
        if (this.A00 != 0) {
            C131136kZ stateHolder = ((FloatingViewDraggableContainer) this.A01).getStateHolder();
            stateHolder.A07.A00(27, 16);
            r1 = stateHolder.A08;
            obj = C122566Qw.CAMERA_SWITCH;
        } else {
            CallGrid callGrid = (CallGrid) this.A01;
            if (!C40811vJ.A0b(callGrid.A0N, callGrid.A0R) || ((C131136kZ) callGrid.A0P.get()).A02 != C122686Ri.FOCUS) {
                r1 = callGrid.A0A.A11;
                obj = C122436Qg.CAMERA_SWITCH;
            } else {
                return;
            }
        }
        r1.A0F(obj);
    }

    public void Bon(AnonymousClass70A r14) {
        ScreenShareViewModel screenShareViewModel;
        if (this.A00 != 0) {
            C131136kZ stateHolder = ((FloatingViewDraggableContainer) this.A01).getStateHolder();
            if (stateHolder.A06.A06) {
                stateHolder.A07.A01(C17880vN.A0j(), 32, 16);
                AnonymousClass1G4 r1 = stateHolder.A0H;
                AnonymousClass3MY.A1Y(r1, !AnonymousClass000.A1Y(r1.getValue()));
                return;
            }
            return;
        }
        CallGrid callGrid = (CallGrid) this.A01;
        CallGridViewModel callGridViewModel = callGrid.A0A;
        C17960vV.A07(callGridViewModel);
        CallHeaderStateHolder callHeaderStateHolder = callGrid.A0C;
        C175258yP r7 = callGridViewModel.A0W;
        r7.A07();
        C18030ve r0 = callGridViewModel.A0g;
        C18140vp r9 = callGridViewModel.A19;
        if (!C40811vJ.A0b(r0, r9) && r14.A0O) {
            if (r14.A0E) {
                CallGridViewModel.A0H(callGridViewModel, r14.A0h);
            } else if (r14.A0J) {
                LinkedHashMap linkedHashMap = callGridViewModel.A18;
                if (linkedHashMap.size() == 2) {
                    boolean z = false;
                    for (Object next : linkedHashMap.keySet()) {
                        Object obj = linkedHashMap.get(next);
                        C17960vV.A07(obj);
                        AnonymousClass70A r2 = (AnonymousClass70A) obj;
                        C1404971r r12 = new C1404971r(r2);
                        r12.A0J = !r2.A0J;
                        linkedHashMap.put(next, r12.A01());
                        if (!r2.A0J) {
                            callGridViewModel.A07 = r2.A0h;
                            z = true;
                        }
                    }
                    if (C72463Mc.A1Z(r9)) {
                        callGridViewModel.A0P.A0F((Object) null);
                    }
                    if (z) {
                        C86534Sa A07 = r7.A07();
                        if (callHeaderStateHolder != null) {
                            AnonymousClass11S r22 = callGridViewModel.A0V;
                            boolean z2 = A07.A0N;
                            if (C40811vJ.A01(r22, z2) != null && !callGridViewModel.A0F) {
                                AnonymousClass3MY.A1Y(callHeaderStateHolder.A0N, !C40811vJ.A01(r22, z2).equals(callGridViewModel.A07));
                            }
                        }
                        callGridViewModel.A0Z.A01(C17880vN.A0j(), 32, 16);
                        CallGridViewModel.A0C(r7.A07(), callGridViewModel, false);
                    }
                }
            }
        }
        if (r14.A0M && !r14.A0E && (screenShareViewModel = callGrid.A0F) != null) {
            screenShareViewModel.A0T(C122576Qx.GRID_TILE);
        }
    }

    public void BxT(AnonymousClass70A r7) {
        if (this.A00 != 0) {
            C131136kZ stateHolder = ((FloatingViewDraggableContainer) this.A01).getStateHolder();
            if ((stateHolder.A0B.getValue() instanceof C92734ho) && (!AnonymousClass000.A1Y(stateHolder.A0H.getValue()))) {
                stateHolder.A08.A0F(C122566Qw.AR_EFFECTS);
                stateHolder.A07.A01(C17880vN.A0j(), 62, 16);
            } else if (stateHolder.A06.A04) {
                stateHolder.A0F.setValue(new C134556qm(AnonymousClass11S.A00(stateHolder.A04), false));
                stateHolder.A08.A0F(C122566Qw.SHOW_FOCUS);
            }
        } else {
            CallGrid callGrid = (CallGrid) this.A01;
            if (!callGrid.A0W || !C40811vJ.A0b(callGrid.A0N, callGrid.A0R)) {
                CallGridViewModel callGridViewModel = callGrid.A0A;
                C17960vV.A07(callGridViewModel);
                callGridViewModel.A0W.A07();
                if (r7.A0O && !r7.A0E) {
                    callGridViewModel.A0Z.A01(C17880vN.A0j(), 34, 16);
                    CallGridViewModel.A0H(callGridViewModel, r7.A0h);
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("voip/CallGridViewModel//showVoiceCallParticipantMenu ");
                UserJid userJid = r7.A0h;
                C17900vP.A0b(userJid, A10);
                callGridViewModel.A0O.A0F(userJid);
                return;
            }
            callGrid.A0V = true;
            C131136kZ r2 = (C131136kZ) callGrid.A0P.get();
            UserJid userJid2 = r7.A0h;
            boolean z = r7.A0D;
            C18070vi.A0d(userJid2, 0);
            if (z || AnonymousClass000.A1Y(r2.A0G.getValue()) || !r2.A04.A0O(userJid2) || !(r2.A0B.getValue() instanceof C92734ho)) {
                r2.A0F.setValue(new C134556qm(userJid2, z));
                r2.A08.A0F(C122566Qw.SHOW_FOCUS);
                r2.A07.A00(34, 16);
                return;
            }
            r2.A08.A0F(C122566Qw.AR_EFFECTS);
            r2.A07.A01(C17880vN.A0j(), 62, 16);
        }
    }

    public void Bye() {
        if (this.A00 == 0) {
            VoipActivityV2 voipActivityV2 = ((AnonymousClass7DI) ((CallGrid) this.A01).A05).A00;
            Intent A02 = AnonymousClass1LU.A02(voipActivityV2);
            A02.addFlags(335577088);
            A02.putExtra("from_vr_calling_exit", true);
            voipActivityV2.startActivity(A02);
            voipActivityV2.finish();
        }
    }

    public void Byi(AnonymousClass70A r5) {
        if (this.A00 == 0) {
            CallGridViewModel callGridViewModel = ((CallGrid) this.A01).A0A;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/CallGridViewModel//showVoiceCallParticipantMenu ");
            UserJid userJid = r5.A0h;
            C17900vP.A0b(userJid, A10);
            callGridViewModel.A0O.A0F(userJid);
        }
    }

    public void CPc() {
        if (this.A00 == 0) {
            ((CallGrid) this.A01).A0V = true;
        }
    }
}
