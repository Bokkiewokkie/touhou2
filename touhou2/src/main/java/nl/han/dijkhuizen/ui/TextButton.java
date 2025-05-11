package nl.han.dijkhuizen.ui;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;

import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TextButton extends TextEntity implements MouseButtonPressedListener {

    public TextButton(Coordinate2D initialLocation, String text) {
        super(initialLocation, text);
        setFill(Color.WHITE);
        setFont(Font.font("touhou98", FontWeight.NORMAL, 30));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mb, Coordinate2D cd) {

        throw new UnsupportedOperationException("Not supported yet.");
    }

}
