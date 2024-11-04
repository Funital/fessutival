package com.example.fessutival.schedule;

import android.os.Bundle;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fessutival.R;

import java.util.ArrayList;
import java.util.List;


public class Calendar extends AppCompatActivity {
    private RecyclerView eventRecyclerView;
    private EventAdapter eventAdapter;
    private List<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calendar);

        eventRecyclerView = findViewById(R.id.rv_event);
        eventRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // 초기 일정 목록 설정
        eventList = new ArrayList<>();
        eventAdapter = new EventAdapter(eventList);
        eventRecyclerView.setAdapter(eventAdapter);

        // 달력 위젯 설정 및 날짜 선택 이벤트 처리
        // 예: CalendarView를 사용하는 경우
        CalendarView calendarView = findViewById(R.id.cv_calendar);
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            // 선택한 날짜에 따라 이벤트 업데이트
            updateEventsForDate(year, month, dayOfMonth);
        });
    }

    private void updateEventsForDate(int year, int month, int dayOfMonth) {
        // 임시로 날짜별 일정 데이터를 설정
        eventList.clear();
        if (year == 2024 && month == 10 && dayOfMonth == 1) {
            eventList.add(new Event("Main Stage", "16:30"));
            eventList.add(new Event("써밋", "12:00 PM"));
        } else if (dayOfMonth == 2) {
            eventList.add(new Event("Project Review", "3:00 PM"));
        }
        // 어댑터에 변경 사항 알림
        eventAdapter.notifyDataSetChanged();
    }

}

