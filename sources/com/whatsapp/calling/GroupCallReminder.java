package com.whatsapp.calling;

import X.C18070vi;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.CallParticipant;

public final class GroupCallReminder {
    public final String callID;
    public final DeviceJid creatorDeviceJid;
    public final CallParticipant[] participants;

    public GroupCallReminder(String str, DeviceJid deviceJid, CallParticipant[] callParticipantArr) {
        C18070vi.A0d(str, 1);
        C18070vi.A0d(deviceJid, 2);
        C18070vi.A0d(callParticipantArr, 3);
        this.callID = str;
        this.creatorDeviceJid = deviceJid;
        this.participants = callParticipantArr;
    }

    public final String getCallID() {
        return this.callID;
    }

    public final DeviceJid getCreatorDeviceJid() {
        return this.creatorDeviceJid;
    }

    public final CallParticipant[] getParticipants() {
        return this.participants;
    }
}
