package com.whatsapp.audioRecording;

import android.media.AudioRecord;

public final class AudioRecordFactory {
    public final AudioRecord createAudioRecord(int i, int i2) {
        return new AudioRecord(0, i, 16, 2, i2);
    }
}
