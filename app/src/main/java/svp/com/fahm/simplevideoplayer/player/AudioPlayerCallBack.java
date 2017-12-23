package svp.com.fahm.simplevideoplayer.player;
/*
 * Copyright 2018 Google Inc. All rights reserved to AndroidApps.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Faheem on 20/12/17.
 */

public interface AudioPlayerCallBack {

    @IntDef({State.INVALID, State.PLAYING, State.PAUSED, State.STOP , State.RESET, State.COMPLETED})
    @Retention(RetentionPolicy.SOURCE)
    @interface State {

        int INVALID = -1;
        int PLAYING = 0;
        int PAUSED = 1;
        int STOP = 2;
        int RESET = 3;
        int COMPLETED = 4;
    }

    void onLogUpdated(String formattedMessage);

    void onDurationChanged(int duration);

    void onPositionChanged(int position);

    void onStateChanged(@State int state);

    void onPlaybackCompleted();

}