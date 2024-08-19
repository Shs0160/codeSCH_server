package code_SCH.project.controller;

import code_SCH.project.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final MenuService menuService;

    @Autowired
    public PaymentController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/complete")
    public ResponseEntity<String> completePayment(@RequestParam String menuName) {
        try {
            menuService.processPayment(menuName);
            return ResponseEntity.ok("결제가 완료되었습니다: " + menuName);
        } catch (IllegalStateException e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
